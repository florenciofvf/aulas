package formulario.banco;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textFieldUrlBanco = new JTextField("jdbc:mysql://10.0.1.45/Eleicao");
	private JTextField textFieldDriver = new JTextField("com.mysql.jdbc.Driver");
	private JButton buttonSelecionar = new JButton("Selecionar Registros");
	private JButton buttonAtualizar = new JButton("Atualizar Banco");
	private JButton buttonTestarCon = new JButton("Testar Conexão");
	private JTextField textFieldLogin = new JTextField("root");
	private JTextField textFieldSenha = new JTextField("root");
	private JTextArea textAreaResultado = new JTextArea();
	private JButton buttonFechar = new JButton("Fechar");
	private JButton buttonLimpar = new JButton("Limpa");
	private JTextArea textAreaSQL = new JTextArea();
	
	public Formulario(int largura, int altura) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(largura, altura);
		setLocationRelativeTo(null);
		montarLayout();
		registrarEvento();
		setVisible(true);
	}

	private void montarLayout() {
		setLayout(new BorderLayout());
		
		JPanel panelBotoes = new JPanel(new GridLayout(0, 1));
		panelBotoes.add(buttonSelecionar);
		panelBotoes.add(buttonAtualizar);
		panelBotoes.add(buttonLimpar);

		JPanel panelSQL = new JPanel(new BorderLayout());
		panelSQL.add(BorderLayout.CENTER, new JScrollPane(textAreaSQL));
		panelSQL.add(BorderLayout.EAST, panelBotoes);
		
		JPanel panelConfiguracoes = new JPanel(new GridLayout(0, 2));
		panelConfiguracoes.add(new JLabel("Driver   ", JLabel.RIGHT));
		panelConfiguracoes.add(textFieldDriver);
		panelConfiguracoes.add(new JLabel("Url Banco   ", JLabel.RIGHT));
		panelConfiguracoes.add(textFieldUrlBanco);
		panelConfiguracoes.add(new JLabel("Login   ", JLabel.RIGHT));
		panelConfiguracoes.add(textFieldLogin);
		panelConfiguracoes.add(new JLabel("Senha   ", JLabel.RIGHT));
		panelConfiguracoes.add(textFieldSenha);
		panelConfiguracoes.add(new JLabel());
		panelConfiguracoes.add(buttonTestarCon);

		JTabbedPane fichario = new JTabbedPane();
		fichario.addTab("Instruções SQL", panelSQL);
		fichario.addTab("Configurações", panelConfiguracoes);
		
		JSplitPane divisor = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fichario, new JScrollPane(textAreaResultado));

		JPanel panelSul = new JPanel(new BorderLayout());
		panelSul.add(BorderLayout.EAST, buttonFechar);

		add(BorderLayout.CENTER, divisor);
		add(BorderLayout.SOUTH, panelSul);
		
		textAreaSQL.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textAreaResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
	}

	private void registrarEvento() {
		buttonAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = null;
				try {
					sql = getSQL();
				} catch (Exception ex) {
					erro(ex.getMessage());
					return;
				}
				atualizar(sql);
			}
		});

		buttonSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = null;
				try {
					sql = getSQL();
				} catch (Exception ex) {
					erro(ex.getMessage());
					return;
				}
				selecionar(sql);
			}
		});

		buttonFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaSQL.setText("");
				textAreaSQL.requestFocus();
			}
		});
		
		buttonTestarCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					validarCamposConfig();
				} catch (Exception ex) {
					erro(ex.getMessage());
					return;
				}
				try {
					Connection conn = getConnection();
					conn.close();
					info("Conectado com sucesso!");
				} catch (Exception ex) {
					erro(ex);
				}
			}
		});
	}
	
	private void atualizar(String sql) {
		try {
			validarCamposConfig();
		} catch (Exception ex) {
			erro(ex.getMessage());
			return;
		}
		Connection conn = null;
		try {
			conn = getConnection();
		} catch (Exception ex) {
			erro(ex);
		}
		try {
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
			conn.close();
			info("Instrução executada com sucesso!");
		} catch(Exception e) {
			erro("Erro ao executar a instrução SQL\r\n" + e.getMessage());
		}
	}

	private void selecionar(String sql) {
		try {
			validarCamposConfig();
		} catch (Exception ex) {
			erro(ex.getMessage());
			return;
		}
		Connection conn = null;
		try {
			conn = getConnection();
		} catch (Exception ex) {
			erro(ex);
		}
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			imprimir(rs);
			rs.close();
			st.close();
			conn.close();
		} catch(Exception e) {
			erro("Erro ao executar a instrução SQL\r\n" + e.getMessage());
		}
	}
	
	private void info(String s) {
		textAreaResultado.setForeground(Color.BLACK);
		textAreaResultado.setText(s);
	}
	
	private void erro(String e) {
		textAreaResultado.setForeground(Color.RED);
		textAreaResultado.setText(e);
	}
	
	private void erro(Exception e) {
		textAreaResultado.setForeground(Color.RED);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		textAreaResultado.setText(sw.toString());
	}
	
	private void validarCamposConfig() throws Exception {
		StringBuilder sb = new StringBuilder();
		if(vazio(textFieldDriver.getText())) {
			sb.append("Preencha o campo Driver\r\n");
		}
		if(vazio(textFieldUrlBanco.getText())) {
			sb.append("Preencha o campo Url Banco\r\n");
		}
		if(vazio(textFieldLogin.getText())) {
			sb.append("Preencha o campo Login\r\n");
		}
		if(vazio(textFieldSenha.getText())) {
			sb.append("Preencha o campo Senha\r\n");
		}
		if(sb.length() > 0) {
			throw new Exception(sb.toString());
		}
	}
	
	private Connection getConnection() throws Exception {
		StringBuilder sb = new StringBuilder();
		try {
			Class.forName(textFieldDriver.getText().trim());
		} catch(Exception e) {
			sb.append("Não foi possível carregar o driver do banco de dados.\r\n");
			throw new Exception(sb.toString(), e);
		}
		try {
			Connection conn = DriverManager.getConnection(textFieldUrlBanco.getText().trim(), 
					textFieldLogin.getText().trim(), textFieldSenha.getText().trim());
			return conn;
		} catch(Exception e) {
			sb.append("Não foi possível conectar com o banco de dados.\r\n");
			throw new Exception(sb.toString(), e);
		}
	}
	
	private boolean vazio(String s) {
		return s == null || s.trim().length() == 0;
	}
	
	private String getSQL() throws Exception {
		String sql = textAreaSQL.getSelectedText();
		if(vazio(sql)) {
			sql = textAreaSQL.getText();
		}
		if(vazio(sql)) {
			throw new Exception("Nenhuma Instrução SQL foi encontrada.");
		}
		return sql;
	}
	
	public static void main(String[] args) {
		new Formulario(700, 400);
	}
	
	private void imprimir(ResultSet rs) throws Exception {
		info("");
		ResultSetMetaData rsmd = rs.getMetaData();
		
		List<Coluna> colunas = new ArrayList<Coluna>();
		int qtd = rsmd.getColumnCount();
		for(int i=1; i<=qtd; i++) {
			colunas.add( new Coluna(rsmd.getColumnName(i), rsmd.getColumnLabel(i), rsmd.getColumnDisplaySize(i)));
		}
		
		textAreaResultado.append("+");
		for(Coluna c : colunas) {
			textAreaResultado.append(completar("", c.tamanho, '-') + "+");
		}
		textAreaResultado.append("\r\n");
		
		textAreaResultado.append("|");
		for(Coluna c : colunas) {
			textAreaResultado.append(completar(c.nome, c.tamanho) + "|");
		}
		textAreaResultado.append("\r\n");
		
		textAreaResultado.append("+");
		for(Coluna c : colunas) {
			textAreaResultado.append(completar("", c.tamanho, '-') + "+");
		}
		textAreaResultado.append("\r\n");
		
		while(rs.next()) {
			textAreaResultado.append("|");
			imprimirRegistro(colunas, rs);
			textAreaResultado.append("\r\n");
		}
		
		textAreaResultado.append("+");
		for(Coluna c : colunas) {
			textAreaResultado.append(completar("", c.tamanho, '-') + "+");
		}
	}

	private void imprimirRegistro(List<Coluna> colunas, ResultSet rs) throws Exception {
		for (Coluna coluna : colunas) {
			textAreaResultado.append(completar(rs.getString(coluna.label), coluna.tamanho) + "|");
		}
	}

	private String completar(String s, int total) {
		return completar(s, total, ' ');
	}
	
	private String completar(String s, int total, char c) {
		if(s == null) {
			s = "";
		}
		StringBuilder sb = new StringBuilder(s);
		while(sb.length() < total) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	private class Coluna {
		String label;
		String nome;
		int tamanho;
		Coluna(String nome, String label, int tamanho) {
			if(nome.length() > tamanho) {
				tamanho = nome.length();
			}
			if(label.length() > tamanho) {
				tamanho = label.length();
			}
			this.nome = nome;
			this.label = label;
			this.tamanho = tamanho;
		}
	}
}