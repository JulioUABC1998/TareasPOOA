package boundary;

import java.io.Serializable;
import java.util.Vector;

import entity.Biocenosis;
import entity.Biotopo;

public class SistemaBiologico implements Serializable{
	private String nombre;
	public Vector<Biocenosis> losBiocenosis = new Vector<Biocenosis>();
	public Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
	
	public SistemaBiologico(String nombre) {
		super();
		if (nombre.equals(""))
			nombre = "default";
		
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


	
	
}