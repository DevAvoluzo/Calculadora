
/**
 * @author Gustavo
 * @version 1.0
 * @since Release 1.0 da aplicação
 */

public class CalculadoraTestes {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();

		// cenário de teste 1: Soma de dois valores positivos
		int soma = c1.somar(10, 10);
		System.out.println(soma);

		// cenário de teste 2: Soma de dois valores negativos
		int soma2 = c1.somar(-10, -110);
		System.out.println(soma2);

		// cenário de teste 3: Subtração de dois valores positivos
		int sub = c1.subtrair(10, 10);
		System.out.println(sub);

		// cenário de teste 4: Subtração de dois valores negativos
		int sub2 = c1.subtrair(-10, -110);
		System.out.println(sub2);

		// cenário de teste 5: Multiplicação de dois valores positivos
		int mu = c1.multiplicar(10, 10);
		System.out.println(mu);

		// cenário de teste 6: Multiplicação de dois valores negativos
		int mu2 = c1.multiplicar(-20, -20);
		System.out.println(mu2);

		// cenário de teste 7: Divisão de dois valores positivos
		double div = c1.dividir(30, 10);
		System.out.println(div);

		// cenário de teste 8: Lançamento de exceção
		double div2 = c1.dividir(30, 0);
		System.out.println(div2);

	}
}
