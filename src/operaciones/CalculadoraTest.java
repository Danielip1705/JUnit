package operaciones;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(10, 10);
		int resultado = calc.suma();
		assertEquals(20, resultado );
	}

	@Test
	void testResta_1() {
		Calculadora calc = new Calculadora(15, 10);
		int resultado = calc.resta();
		assertEquals(5, resultado );
	}

	@Test
	void testResta_2() {
		Calculadora calc = new Calculadora(15, 30);
		int resultado = calc.resta();
		assertEquals(15, resultado );
	}
	
	@Test
	void testResta2_1() {
		Calculadora calc = new Calculadora(50, 10);
		boolean resultado = calc.resta2();
		assertTrue(resultado);
	}
	
	
	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(5, 10);
		int resultado = calc.multiplica();
		assertEquals(50, resultado );
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.divide();
		assertEquals(2, resultado );
	}

	@Test
	void testDivide2_1() {
		Calculadora calc = new Calculadora(20, 0);
		Integer resultado = calc.divide2();
		assertNull(resultado);
	}
	
	@Test
	void testDivide2_2() {
		Calculadora calc = new Calculadora(0, 20);
		Integer resultado = calc.divide2();
		assertNotNull(resultado);
	}
	


}
