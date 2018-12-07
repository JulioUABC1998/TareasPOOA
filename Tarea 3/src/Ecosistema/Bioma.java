package Ecosistema;

import java.util.Vector;
import Ecosistema.Ecosistema;

public class Bioma {
	String nombre;
	public Vector<Ecosistema> losEcosistemas = new Vector<Ecosistema>();
	
	public Bioma(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Vector<Ecosistema> getLosEcosistemas() {
		return losEcosistemas;
	}

	@Override
	public String toString() {
		return "Bioma [nombre=" + nombre + ", losEcosistemas=" + losEcosistemas + "]";
	}
	
	
}