package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class par_cajaNegraTest {

	@ParameterizedTest
	@ValueSource(ints = { 1002, 1008, 999, 500, 1669, 2600, 2669, 0, -5 })
	void testWithValueSource(int argument) {
		assertTrue(par_cajaNegra.par(argument));

	}
	
	@Test
	void test() {
		int numero = (int)( Math.random() * 10);
		System.out.println(numero);
		assertTrue(par_cajaNegra.par(numero));

	}
	
	@Test
	void testPar() {
		for (int i = 1000; i <= 2000; i = i+2) {
			boolean result = par_cajaNegra.par(i);
			assertEquals(true, result);
		}
		
	}

	
	@Test	
	void testImPar() {
		for (int i = 1001; i <= 2000; i = i+2) {
		boolean result = par_cajaNegra.par(i);
		
				assertEquals(true, result);
			}
	}
	/*
	 * void testParInferior() { par_cajaNegra comprobador = new par_cajaNegra(); int
	 * numero = 500; boolean result = comprobador.par(numero); assertEquals(false,
	 * result); }
	 * 
	 * void testImparInferior() { par_cajaNegra comprobador = new par_cajaNegra();
	 * int numero = 333; boolean result = comprobador.par(numero);
	 * assertEquals(false, result); }
	 * 
	 * void testPar() { par_cajaNegra comprobador = new par_cajaNegra(); int numero
	 * = 1500; boolean result = comprobador.par(numero); assertEquals(true, result);
	 * }
	 * 
	 * void testImpar() { par_cajaNegra comprobador = new par_cajaNegra(); int
	 * numero = 1333; boolean result = comprobador.par(numero); assertEquals(false,
	 * result); }
	 * 
	 * void testParSuperior() { par_cajaNegra comprobador = new par_cajaNegra(); int
	 * numero = 2500; boolean result = comprobador.par(numero); assertEquals(false,
	 * result); }
	 * 
	 * void testImparSuperior() { par_cajaNegra comprobador = new par_cajaNegra();
	 * int numero = 2333; boolean result = comprobador.par(numero);
	 * assertEquals(false, result); }
	 * 
	 * void testZero() { par_cajaNegra comprobador = new par_cajaNegra(); int numero
	 * = 0; boolean result = comprobador.par(numero); assertEquals(false, result); }
	 * 
	 * void testNegativo() { par_cajaNegra comprobador = new par_cajaNegra(); int
	 * numero = -2333; boolean result = comprobador.par(numero); assertEquals(false,
	 * result); }
	 * 
	 * 
	 * 
	 * }
	 */

}