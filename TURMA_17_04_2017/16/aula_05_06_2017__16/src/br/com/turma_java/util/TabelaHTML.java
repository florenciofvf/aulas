package br.com.turma_java.util;

public class TabelaHTML {
	private int qtdLinhas;
	private int qtdColunas;
	private String alinhamento;
	private int borda;
	private int largura;
	private String corFundo;

	public int getQtdLinhas() {
		return qtdLinhas;
	}

	public void setQtdLinhas(int qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}

	public int getQtdColunas() {
		return qtdColunas;
	}

	public void setQtdColunas(int qtdColunas) {
		this.qtdColunas = qtdColunas;
	}

	public String getAlinhamento() {
		return alinhamento;
	}

	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}

	public int getBorda() {
		return borda;
	}

	public void setBorda(int borda) {
		this.borda = borda;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public String getHtml() {
		return gerarHtml();
	}
	
	public String gerarHtml() {
		StringBuilder sb = new StringBuilder("<table");
		sb.append("  align=" + citar(getAlinhamento()));
		sb.append("  border=" + citar(getBorda()));
		
		sb.append("  bgColor=" + citar(getCorFundo()));
		
		sb.append("  width=" + citar(getLargura() + "%"));
		sb.append(">");
		
		int TOTAL_LINHAS = getQtdLinhas();
		int TOTAL_COLUNAS = getQtdColunas();
		
		for(int L=1; L<=TOTAL_LINHAS; L++) {
			sb.append("<tr>");
			
			for(int C=1; C<=TOTAL_COLUNAS; C++) {
				sb.append("<td>");
				sb.append(L + "," + C);
				sb.append("</td>");
			}
			
			sb.append("</tr>");
		}
		
		sb.append("</table>");
		
		return sb.toString();
	}
	
	private String citar(Object objeto) {
		if(objeto == null) {
			return "''";
		}
		
		return "'" + objeto.toString() + "'";
	}

	public String getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(String corFundo) {
		this.corFundo = corFundo;
	}
}





