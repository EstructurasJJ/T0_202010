package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals("El tamaño del arreglo no es el esperado",CAPACIDAD,modelo.darTamano());
		
		
		
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp1();
		modelo.agregar("X");
		assertEquals("El tamaño no es el esperado", 1,modelo.darTamano());
		
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals("No encontró el valor esperado", "2",modelo.buscar("2"));
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals("No se eliminó el valor esperado", "3",modelo.eliminar("3"));
		assertEquals("No modificó el tamaño", CAPACIDAD-1, modelo.darTamano());
		
	}

}
