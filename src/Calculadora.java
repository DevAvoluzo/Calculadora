
/**
 * @author Gustavo
 * @version 1.3
 * @since Release 1.3 da aplicação
 */

public class Calculadora {

	/**
	 * @param num1, primeiro valor utilizado para soma
	 * @param num2, segundo valor utilizado para soma
	 * @return , resultado do retorno
	 */

	public int somar(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * @param num1, primeiro valor utilizado para subtrair
	 * @param num2, segundo valor utilizado para subtrair
	 * @return , resultado do retorno
	 */

	public int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * @param num1, primeiro valor utilizado para multiplicar
	 * @param num2, segundo valor utilizado para  multiplicar
	 * @return , resultado do retorno
	 */

	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * @param num1, primeiro valor utilizado para dividir
	 * @param num2, segundo valor utilizado para dividir
	 * @throws caso o usuario passe o valor zero
	 * @return , resultado do retorno
	 */

	public double dividir(double num1, double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Não pode dividir um número por zero.");
		}
		return num1 / num2;
	}

}
