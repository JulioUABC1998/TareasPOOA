package Ecosistema;

import java.io.Serializable;
import java.util.Vector;
import Ecosistema.Biocenosis;
import Ecosistema.Biotopo;

public class SistemaBiologico implements Serializable{
	public String nombre;
	public Vector<Biocenosis> losBiocenosis = new Vector<Biocenosis>();
	public Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
	
	public SistemaBiologico(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public Vector<Biocenosis> getLosBiocenosis() {
		return losBiocenosis;
	}

	public Vector<Biotopo> getLosBiotopos() {
		return losBiotopos;
	}
	
	public int sumar(int x, int y) {
		return x + y;
	}

	@Override
	public String toString() {
		return "SistemaBiologico [nombre=" + nombre + ", losBiocenosis=" + losBiocenosis + ", losBiotopos="
				+ losBiotopos + "]";
	}

	
}