package br.com.turma_java.banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainConexao {

	public static void main(String[] args) {
		// 1 - Carregar o driver do banco de dados
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Carregado!");
		} catch(Exception e) {
			System.out.println("Driver não carregado.");
			return;
		}

		// 2 - Obter através do DriverManager um objeto do tipo Connection
		String urlBanco = "jdbc:mysql://10.0.1.35/CarroDB";
		String usuario = "root";
		String senha = "root";
		
		try {
			Connection conn = DriverManager.getConnection(urlBanco, usuario, senha);
			System.out.println("CONECTADO");
			conn.close();
		} catch(Exception e) {
			System.out.println("Erro ao tentar conectar.");
		}
	}

}
