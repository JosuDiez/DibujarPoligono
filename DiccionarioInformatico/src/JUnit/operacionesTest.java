package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	@Test
	void testSumar() {
		operaciones operaciones = new operaciones();
		int numero1 = 7, numero2 = 8;
		int result = operaciones.sumar(numero1, numero2);
		assertEquals(15, result);
	}

	@Test
	void testRestar() {
		operaciones operaciones = new operaciones();
		int numero1 = 7, numero2 = 8;
		int result = operaciones.restar(numero1, numero2);
		assertEquals(-1, result);
	}

	@Test
	void testMultiplicar() {
		operaciones operaciones = new operaciones();
		int numero1 = 7, numero2 = 8;
		int result = operaciones.multiplicar(numero1, numero2);
		assertEquals(56, result);
	}

	@Test
	void testDividir() {
		operaciones operaciones = new operaciones();
		int numero1 = 7, numero2 = 8;
		int result = operaciones.dividir(numero1, numero2);
		assertEquals(0, result);
	}

	@Test
	void testResto() {
		operaciones operaciones = new operaciones();
		int numero1 = 15, numero2 = 3;
		int result = operaciones.resto(numero1, numero2);
		assertEquals(0, result);
	}

}
