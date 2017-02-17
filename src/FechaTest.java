import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FechaTest {
	
	private Fecha fechaBisiesta, fechaActual;
	//private Fecha fechaInvalida, fechaInvalidaMes;


	@Before
	public void setUp() throws Exception {
		fechaBisiesta = new Fecha (2, 4, 2016);
		fechaActual = new Fecha (17, 2, 2017);
		
		//no se pueden crear fechas inválidas porque falla el constructor
		//fechaInvalida = new Fecha (29, 2, 2015);
		//fechaInvalidaMes = new Fecha (2, 25, 2000);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void bisiestoFunciona() {
		assertTrue(fechaBisiesta.esBisiesto());
		assertFalse(fechaActual.esBisiesto());
	}
	
	@Test
	public void obtenerDiasDelMes() {
		assertEquals(28, Fecha.diasDelMes(2));
		assertEquals(30, Fecha.diasDelMes(11));
		assertEquals(31, Fecha.diasDelMes(12));
	}
	
	
	
	/**
	 * Este método ha sido deshabilitado porque el constructor de la clase ya comprueba que la fecha sea válida.
	 * No se pueden crear fechas inválidas con las que hacer las pruebas.
	 */
	/*
	@Test
	public void confirmaFechasValidas() {
		assertTrue(fechaActual.fechaValida());
		assertFalse(fechaInvalida.fechaValida());
		assertFalse(fechaInvalidaMes.fechaValida());
	}*/

}
