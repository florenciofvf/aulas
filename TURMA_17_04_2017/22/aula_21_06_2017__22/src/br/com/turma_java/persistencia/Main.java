package br.com.turma_java.persistencia;

public class Main {

	public static void main(String[] args) throws Exception {
		Cliente c = new Cliente();
		c.setIdade(56);
		c.setNome("Antonio José");
		
		CrudDAO dao = new CrudDAO();
		//dao.salvar(c);
		System.out.println( dao.gerarSQLInsert(c) );
	}

	@Tabela(nome="TB_CLIENTE")
	static class Cliente {
		@Campo(nome="STR_NOME") String nome;
		@Campo(nome="INT_IDADE") Integer idade;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getIdade() {
			return idade;
		}
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
	}
}
