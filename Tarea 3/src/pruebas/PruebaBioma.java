package pruebas;

import Ecosistema.Biocenosis;
import Ecosistema.Bioma;
import Ecosistema.Biotopo;
import Ecosistema.Ecosistema;

public class PruebaBioma {

	public PruebaBioma() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bioma elBioma = new Bioma("Cuerpo humano");
		
		Ecosistema elEcosistema = new Ecosistema("Sistema digestivo");
		
		Biocenosis laBiocenosis = new Biocenosis("Lombrices", elEcosistema);
		
		elEcosistema.losBiocenosis.add(laBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Estomago", elEcosistema);
		
		elEcosistema.losBiotopos.add(elBiotopo);
		
		elBioma.losEcosistemas.add(elEcosistema);
		
		System.out.println(elBioma);

	}

}
