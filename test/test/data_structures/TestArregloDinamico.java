package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		ArregloDinamico ejm=new ArregloDinamico(1);
		assertEquals("No coincide el tamaño máximo",1,ejm.darCapacidad());
		assertEquals("No coincide el tamaño actual",0,ejm.darTamano());
		
	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
		assertEquals("No es el resultado esperado","1",arreglo.darElemento(1));
	
	}

}
