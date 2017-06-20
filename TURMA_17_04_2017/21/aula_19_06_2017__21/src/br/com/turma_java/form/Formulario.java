package br.com.turma_java.form;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	private JButton button = new JButton("OK");
	
	public Formulario() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		new Relogio().start();
		setSize(200, 200);
		setLayout(null);
		
		button.setSize(20, 20);
		button.setLocation(20, 20);
		add(button);
		
		setVisible(true);
		
		new Thread(this).start();
	}
	
	class Relogio extends Thread {
		public void run() {  
			while(true) {
				mostrarDataHora();
				try { Thread.sleep(1000); } catch(Exception e) {}
			}
		}
	}
	
	int x = 1;
	int y = 1;
	
	public void run() {
		while(true) {
			if(button.getX() < 0 || button.getX() > getWidth() - 20) {
				x *= -1;
			}

			if(button.getY() < 0 || button.getY() > getHeight() - 40) {
				y *= -1;
			}
			
			button.setLocation(button.getX() + x, button.getY() + y);
			try { Thread.sleep(10); } catch(Exception e) {}
		}
	}

	
	private void mostrarDataHora() {
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		setTitle(  f.format(new Date()) );
	}
	
	public static void main(String[] args) {
		new Formulario();
	}
}