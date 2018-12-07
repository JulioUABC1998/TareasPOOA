package presentation.ClienteServidor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


import presentation.EcosistemaDesktop;

public class Servidor {
	private EcosistemaDesktop elEcosistema;
	private int puerto = 10000;
	private Cliente cliente;

	public Servidor() {
		// TODO Auto-generated constructor stub
		cargarEcosistema();
	}

	public Servidor(int puerto) {
		super();
		this.puerto = puerto;
		this.cliente= cliente;
		
		cargarEcosistema();
	}
	
	private void cargarEcosistema() {
		try {
			FileInputStream miFileInputStream = new FileInputStream("miArchivo.dat");
			ObjectInputStream miObjectInputStream = new ObjectInputStream(miFileInputStream);
			elEcosistema = (EcosistemaDesktop)miObjectInputStream.readObject();
			System.out.println(elEcosistema);
			miFileInputStream.close();
			miObjectInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void iniciarServidor() {


		try {
			//Creamos servidor en el puerto
			ServerSocket miServerSocket = new ServerSocket(puerto);
			System.out.println("Se inicia servicio");

			while(true) {
				//Esperamos conexion y generamos socket cuando hay una
				System.out.println("En espera de una conexion");
				Socket miSocket = miServerSocket.accept();
				System.out.println("Se acepta conexion");
				SocketThread miSocketThread = new SocketThread(miSocket, elEcosistema);
				miSocketThread.start();
				System.out.println("Se atiende conexion en un thread nuevo");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
