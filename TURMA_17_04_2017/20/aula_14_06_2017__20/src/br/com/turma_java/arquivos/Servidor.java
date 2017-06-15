package br.com.turma_java.arquivos;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Servidor {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(4567);
		
		System.out.println("Iniciado");
		while(true) {
			Socket socket = server.accept();
		
			//DataInput in = new DataInputStream( socket.getInputStream() );
			//System.out.println( in.readInt() );
			
			ObjectInput in = new ObjectInputStream( socket.getInputStream() );
			Object obj = in.readObject();
			
			if(obj instanceof Icon) {
				JOptionPane.showMessageDialog(null, (Icon)obj);
			} else {
				System.out.println(obj);
			}
			
			socket.close();
		}

	}

}
