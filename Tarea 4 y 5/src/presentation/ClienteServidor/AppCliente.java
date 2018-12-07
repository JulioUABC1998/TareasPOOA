package presentation.ClienteServidor;

public class AppCliente {

	public AppCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente miCliente = new Cliente(1234, "localhost");
		miCliente.enviarMensaje("Hola mundo!");
	}

}
