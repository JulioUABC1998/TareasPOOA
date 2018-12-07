package tests;

import boundary.Ecosistema;
import entity.Biocenosis;
import entity.Biotopo;

public class PruebaUno {

	public PruebaUno() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecosistema elEcosistema = new Ecosistema("Desierto");
		
		System.out.println(elEcosistema);
		
		Biotopo elHormiguero = new Biotopo("Hormiguero", elEcosistema);
		elEcosistema.losBiotopos.addElement(elHormiguero);
		
		System.out.println(elEcosistema);
		
		Biocenosis laColonia = new Biocenosis("Hormigas", elEcosistema);
		elEcosistema.losBiocenosis.addElement(laColonia);		
		
		System.out.println(elEcosistema);
	}

}
