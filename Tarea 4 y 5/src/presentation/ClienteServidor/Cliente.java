package presentation.ClienteServidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;


import presentation.EcosistemaDesktop;

public class Cliente {
	private int puerto = 10000;
	private String host = "localhost";
	private EcosistemaDesktop miEcosistema;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int puerto, String host) {
		super();
		this.puerto = puerto;
		this.host = host;
	}
	
	public void enviarMensaje(String mensaje) {
		String respuesta;
		
		try {
			//Aqui conecto
			Socket miSocket = new Socket(host, puerto);
			System.out.println("El cliente se conecto al host " + host + " en el puerto " + puerto);
			
			//Aqui escribo
			DataOutputStream miDataOutputStream = new DataOutputStream(miSocket.getOutputStream());
			miDataOutputStream.writeUTF(mensaje);
			System.out.println("Se envio el siguiente mensaje: " + mensaje);
			
			//Aqui leo
			//DataInputStream miDataInputStream = new DataInputStream(miSocket.getInputStream());
			//respuesta = miDataInputStream.readUTF();
			//System.out.println("Se recibio la siguiente respuesta: " + respuesta);
			
			//Aqui leo objeto
			ObjectInputStream miObjectInputStream = new ObjectInputStream(miSocket.getInputStream());
			miEcosistema = (EcosistemaDesktop)miObjectInputStream.readObject();
			System.out.println(miEcosistema);
			
			//Aqui desconecto
			System.out.println("El ciente se desconecto");
			miDataOutputStream.close();
			miSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
