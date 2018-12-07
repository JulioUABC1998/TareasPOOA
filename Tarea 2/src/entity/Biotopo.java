package entity;

import java.io.Serializable;
import java.util.Vector;

import boundary.SistemaBiologico;

public class Biotopo implements Serializable{
	
	private String nombre;
	public SistemaBiologico elSistemaBiologico;
	private Vector<SerVivo> seresvivos = new Vector<SerVivo>();
	
	
	public Biotopo(String nombre, SistemaBiologico elSistemaBiologico) {
		super();
		this.nombre = nombre;
		this.elSistemaBiologico = elSistemaBiologico;
	}
	public String getNombre() {
		return nombre;
	}
	public SistemaBiologico getElSistemaBiologico() {
		return elSistemaBiologico;
	}
	public Vector<SerVivo> getSeresvivos() {
		return seresvivos;
	}
	@Override
	public String toString() {
		return "Biotopo [nombre=" + nombre + ", elSistemaBiologico=" + elSistemaBiologico + ", seresvivos=" + seresvivos
				+ "]";
	}
	
	
	
}