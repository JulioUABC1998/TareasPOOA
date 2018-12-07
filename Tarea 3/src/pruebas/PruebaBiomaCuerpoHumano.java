package pruebas;

import Ecosistema.Biocenosis;
import Ecosistema.Bioma;
import Ecosistema.BiomaCuerpoHumano;
import Ecosistema.Biotopo;
import Ecosistema.Ecosistema;

public class PruebaBiomaCuerpoHumano {

	public PruebaBiomaCuerpoHumano() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiomaCuerpoHumano elBiomaCuerpoHumano = new BiomaCuerpoHumano("Cuerpo humano");
		
		Ecosistema elEcosistema = new Ecosistema("Sistema digestivo");
		
		Biocenosis laBiocenosis = new Biocenosis("Lombrices", elEcosistema);
		
		elEcosistema.losBiocenosis.add(laBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Estomago", elEcosistema);
		
		elEcosistema.losBiotopos.add(elBiotopo);
		
		elBiomaCuerpoHumano.losEcosistemas.add(elEcosistema);
		
		System.out.println(elBiomaCuerpoHumano);
	}

}
