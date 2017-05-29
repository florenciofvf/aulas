package br.com.turma_java.banco;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.turma_java.config.Config;

public class MainConexao {

	public static void main(String[] args) {
		// 1 - Carregar o driver do banco de dados
		try {
			Class.forName( Config.getString("driver") );
			System.out.println("Driver Carregado!");
		} catch(Exception e) {
			System.out.println("Driver não carregado.");
			return;
		}

		// 2 - Obter através do DriverManager um objeto do tipo Connection
		String urlBanco = Config.getString("urlBanco");
		String usuario = Config.getString("usuario");
		String senha = Config.getString("senha");
		
		try {
			Connection conn = DriverManager.getConnection(urlBanco, usuario, senha);
			System.out.println("CONECTADO");
			conn.close();
		} catch(Exception e) {
			System.out.println("Erro ao tentar conectar.");
		}
	}

}
