package cadena;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void testLongitudBien() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.longitud("Hola");
		assertEquals("Fail en longitudBien", expected, actual, 0.01);
	}
	@Test
	public void testLongitudEror() {
		Cadena target = new Cadena();
		int expected = 8;
		int actual = target.longitud("Hola");
		assertEquals("Fail en longitudEror", expected, actual, 0.01);
	}
	@Test
	public void testVocalesBien() {
		Cadena target = new Cadena();
		int expected = 1;
		int actual = target.vocales("HolA");
		assertEquals("Fail en vocalesBien", expected, actual, 0.01);
	}
	@Test
	public void testVocalesError() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.vocales("HolA");
		assertEquals("Fail en vocalesError", expected, actual, 0.01);
	}
	@Test
	public void testInvertirBien() {
		Cadena target = new Cadena();
		String expected = "aloH";
		String actual = target.invertir("Hola");
		assertEquals("Fail en invertirBien", expected, actual);
	}
	@Test
	public void testInvertirError() {
		Cadena target = new Cadena();
		String expected = "aaloH";
		String actual = target.invertir("Hola");
		assertEquals("Fail en invertirError", expected, actual);
	}
	@Test
	public void testContarLetraBien() {
		Cadena target = new Cadena();
		String prueba = "contarLetra";
		int expected = 0;
		int actual = target.contarLetra(prueba, '1');
		assertEquals("Fail en contarLetraBien", expected, actual, 0.01);
	}
	@Test
	public void testContarLetraError() {
		Cadena target = new Cadena();
		String prueba = "contarLetra";
		int expected = 10;
		int actual = target.contarLetra(prueba, '1');
		assertEquals("Fail en contarLetraError", expected, actual, 0.01);
	}
	
}
