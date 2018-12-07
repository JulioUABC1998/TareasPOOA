package presentation.ClienteServidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


import presentation.EcosistemaDesktop;

public class SocketThread extends Thread{
	private EcosistemaDesktop miEcosistema;
	private Socket miSocket;
	private DataInputStream miDataInputStream;
	private DataOutputStream miDataOutputStream;
	private ObjectOutputStream miObjectOutputStream;
	private String lectura;
	private String escritura;

	public SocketThread(Socket socket, EcosistemaDesktop ecosistema) {
		super();
		this.miSocket = socket;
		this.miEcosistema = ecosistema;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			//leemos por el socket
			miDataInputStream = new DataInputStream(miSocket.getInputStream());
			lectura = miDataInputStream.readUTF();
			System.out.println("El cliente envia lo siguiente: " + lectura);
			
			
			//decidimos que responder
			if(lectura.contains("XYZ")) {
				escritura = "Come mocos";				
			}else {
				escritura = "Me caes bien";
			}

			//escribimos por el socket
			//miDataOutputStream = new DataOutputStream(miSocket.getOutputStream());
			//miDataOutputStream.writeUTF(escritura);
			//System.out.println("El servidor responde lo siguiente: " + escritura);	
			
			//escribimos objeto por el socket
			miObjectOutputStream = new ObjectOutputStream(miSocket.getOutputStream());
			miObjectOutputStream.writeObject(miEcosistema);
			System.out.println("El servidor responde lo siguiente: " + miEcosistema);
			
			miObjectOutputStream.close();
			miDataInputStream.close();
			miSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
