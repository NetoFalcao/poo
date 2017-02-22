package artigotdd.calculadora.teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculadoraTeste {

	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception{
		int valorA = 1;
		int valorB = 2;
		int soma = 0;
		Calculadora calculadora = new Calculadora();
		soma = calculadora.soma(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubitrairDoisValoresPassados() throws Exception{
		int valorA = 1;
		int valorB = 2;
		int subtra��o = 0;
		
		Calculadora calculadora = new Calculadora();
		subtra��o = calculadora.subtrair(valorA, valorB);
		
		assertEquals(3, subtra��o);
	}
	
	
	
}
