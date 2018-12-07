package tests;

import boundary.SistemaBiologico;

class SistemaBiologicoTest {

	

	private void assertEquals(String string, String nombre) {
		// TODO Auto-generated method stub

		SistemaBiologico miSistemaBiologico = new SistemaBiologico("");
		
		assertEquals("default", miSistemaBiologico.getNombre());
	}

}
