package Ecosistema;

import java.io.Serializable;

public class Biotopo implements Serializable{
	public String nombre;
	public SistemaBiologico elSistemaBiologico;
	
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

	@Override
	public String toString() {
		return "Biotopo [nombre=" + nombre + "]";
	}
	
	
	
}