package Ecosistema;

public class Ecosistema extends SistemaBiologico {

	public Ecosistema(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Ecosistema() {
		super("default");
		// TODO Auto-generated constructor stub
	}	

	@Override
	public String toString() {
		return "Ecosistema [nombre=" + nombre + ", losBiocenosis=" + losBiocenosis + ", losBiotopos=" + losBiotopos
				+ "]";
	}
	
	
}