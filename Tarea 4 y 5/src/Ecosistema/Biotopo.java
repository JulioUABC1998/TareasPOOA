package Ecosistema;

import java.io.Serializable;

import presentation.EcosistemaDesktop;

public class Biotopo implements Serializable{
	public String nombre;
	public EcosistemaDesktop elSistemaBiologico;
	public Biotopo i;
	public int size;
	public Biotopo LastElement;
	int j;
	
	public Biotopo(String nombre,Biotopo LastElement, EcosistemaDesktop elEcosistema, int j, int size) {
		super();
		this.nombre = nombre;
		this.elSistemaBiologico = elEcosistema;
		this.i=i;
		this.size=size;
		this.LastElement=LastElement;
		this.j=j;
	}

	public String getNombre() {
		return nombre;
	}

	public EcosistemaDesktop getElSistemaBiologico() {
		return elSistemaBiologico;
	}
	
	public Biotopo getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Biotopo [nombre=" + nombre + "]";
	}

	public Biotopo getlastElement() {
		// TODO Auto-generated method stub
		return LastElement;
	}

	public void add(Biotopo elBiotopo) {
		// TODO Auto-generated method stub
		System.out.println("Biotopo [nombre=" + nombre + "]"); 
	}

	
	
	
}