package tests;

import boundary.Ecosistema;
import entity.Biotopo;

class EcosistemaTest {

	
	

	private void assertEquals(String string, String nombre) {
		// TODO Auto-generated method stub
	Ecosistema miEcosistema = new Ecosistema("Estomago");
		
		assertEquals("Estomago", miEcosistema.getNombre());
		
		Biotopo miBiotopo = new Biotopo("Amibas", miEcosistema);
		
		miEcosistema.losBiotopos.add(miBiotopo);
		
		assertEquals("Amibas", miEcosistema.losBiotopos.get(0).getNombre());
		

	}

}
