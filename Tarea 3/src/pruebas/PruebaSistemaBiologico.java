package pruebas;

import Ecosistema.Biocenosis;
import Ecosistema.Biotopo;
import Ecosistema.SistemaBiologico;

public class PruebaSistemaBiologico {

	public PruebaSistemaBiologico() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SistemaBiologico elSistemaBiologico = new SistemaBiologico("Sistema digestivo");
		
		Biocenosis laBiocenosis = new Biocenosis("Lombrices", elSistemaBiologico);
		
		elSistemaBiologico.losBiocenosis.add(laBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Estomago", elSistemaBiologico);
		
		elSistemaBiologico.losBiotopos.add(elBiotopo);
		
		System.out.println(elSistemaBiologico);

	}

}
