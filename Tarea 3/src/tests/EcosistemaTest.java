package tests;



import Ecosistema.Biotopo;
import Ecosistema.Ecosistema;

class EcosistemaTest {

	
	void test() {
		assertEquals("Planeta tierra",new Ecosistema("Planeta tierra").getNombre());
		assertEquals("default",new Ecosistema().getNombre());
		
		assertEquals(false, new Ecosistema().toString().isEmpty());
		
		Ecosistema unEcosistema = new Ecosistema("Planeta tierra");
		
		assertEquals(4, unEcosistema.sumar(2, 2));
		assertEquals(0, unEcosistema.sumar(0, 0));
		assertEquals(6, unEcosistema.sumar(3, 3));
		
		assertEquals("Planeta tierra",unEcosistema.getNombre());
		
		Biotopo unBiotopo  = new Biotopo("Oceano", unEcosistema);
		unEcosistema.losBiotopos.add(unBiotopo);
		
		assertEquals("Oceano",unEcosistema.losBiotopos.get(0).nombre);
		
		
	}

	private void assertEquals(boolean b, boolean empty) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String nombre) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
