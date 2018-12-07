package tests;



import boundary.Ecosistema;
import entity.Biotopo;

class BiotopoTest {

	
	

	private void assertEquals(String string, String nombre) {
		// TODO Auto-generated method stub
		
			Ecosistema miEcosistema = new Ecosistema("Estomago");
		
			Biotopo miBiotopo = new Biotopo("Amibas", miEcosistema);
			
			assertEquals("Amibas", miBiotopo.getNombre());
		
	}

}
