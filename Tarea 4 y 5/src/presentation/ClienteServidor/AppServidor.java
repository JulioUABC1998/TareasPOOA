package presentation.ClienteServidor;

public class AppServidor {

	public AppServidor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Servidor miServidor = new Servidor(1234);
		miServidor.iniciarServidor();
	}

}
