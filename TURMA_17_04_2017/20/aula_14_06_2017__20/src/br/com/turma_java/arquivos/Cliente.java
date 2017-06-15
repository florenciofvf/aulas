package br.com.turma_java.arquivos;

//import java.io.DataOutput;
//import java.io.DataOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;

public class Cliente {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.25.84", 4567);
		System.out.println("Conectado");
		
		//DataOutput out = new DataOutputStream( socket.getOutputStream() );
		//out.writeInt(234);
		
		ObjectOutput out = new ObjectOutputStream( socket.getOutputStream() );
		out.writeObject(new ImageIcon("c:\\diretorio\\imagem.png"));
		
		socket.close();
	}
}