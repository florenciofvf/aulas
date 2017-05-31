package br.com.turma_java.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.turma_java.util.Config;

public class Conexao {
	private String driver;
	private String urlBanco;
	private String usuario;
	private String senha;
	
	public Conexao() {
	}

	public Conexao(String driver, String urlBanco, String usuario, String senha) {
		this.driver = driver;
		this.urlBanco = urlBanco;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Connection getConnection() throws ConexaoExcecao {
		try {
			 Class.forName(getDriver());
		} catch(ClassNotFoundException cnfe) {
			throw new ConexaoExcecao(Config.getString("erro_driver"));
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					getUrlBanco(), getUsuario(), getSenha());
			
			return conn;
		} catch(Exception e) {
			throw new ConexaoExcecao(Config.getString("erro_conexao"));
		}
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrlBanco() {
		return urlBanco;
	}

	public void setUrlBanco(String urlBanco) {
		this.urlBanco = urlBanco;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}





