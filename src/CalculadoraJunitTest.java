import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Gustavo
 * @version 1.1
 * @since Release 1.1 da aplicação
 */

public class CalculadoraJunitTest {

	/*
	 * cenário de teste 1: Soma de dois valores positivos
	 */
	@Test
	public void SomarDoisNumerosPositivos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int soma = c1.somar(10, 20);
		// modelo de comparativo de teste
		assertEquals(30, soma);
	}

	/*
	 * cenário de teste 2: Soma de dois valores negativos
	 */
	@Test
	public void SomarDoisNumerosNegativos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int soma = c1.somar(-10, -20);
		// modelo de comparativo de teste
		assertEquals(-30, soma);
	}

	/*
	 * cenário de teste 3: Subtração de dois valores positivos
	 */
	@Test
	public void SubtrairDoisNumerosPositivos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int sub = c1.subtrair(40, 20);
		// modelo de comparativo de teste
		assertEquals(20, sub);
	}

	/*
	 * cenário de teste 4: Subtração de dois valores negativos
	 */
	@Test
	public void SubtrairDoisNumerosNegativos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int sub = c1.subtrair(-10, -10);
		// modelo de comparativo de teste
		assertEquals(0, sub);
	}

	/*
	 * cenário de teste 5: Multiplicação de dois valores positivos
	 */
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int mu = c1.multiplicar(5, 5);
		// modelo de comparativo de teste
		assertEquals(25, mu);
	}

	/*
	 * cenário de teste 6: Multiplicação de dois valores negativos
	 */
	@Test
	public void MultiplicarDoisNumerosNegativos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		int mu = c1.multiplicar(-5, -5);
		// modelo de comparativo de teste
		assertEquals(25, mu);
	}

	/*
	 * cenário de teste 7: Divisão de dois valores positivos
	 */
	@Test
	public void DividirDoisNumerosPositivos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		double div = c1.dividir(10, 5);
		// modelo de comparativo de teste
		assertEquals(2, div);
	}

	/*
	 * cenário de teste 8: Divisão de dois valores negativos
	 */
	@Test
	public void DividirDoisNumerosNegativos() {
		Calculadora c1 = new Calculadora();
		// parametros a serem utilizados para o teste
		double div = c1.dividir(-10, -5);
		// modelo de comparativo de teste
		assertEquals(2, div);

	}

}
