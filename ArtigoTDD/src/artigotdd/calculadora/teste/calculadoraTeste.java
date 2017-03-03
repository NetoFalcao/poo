package artigotdd.calculadora.teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculadoraTeste {
	
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception{
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);
		
		assertEquals(3, divisao);
	}
	
	@Test (expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirPorZero() throws Exception{
		int valorA = 6;
		int valorB = 0; //divisão por zero
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);
		
		assertEquals(0, divisao);
	}

}
