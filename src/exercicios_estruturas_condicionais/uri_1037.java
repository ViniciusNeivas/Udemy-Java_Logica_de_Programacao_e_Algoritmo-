package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1037 {

	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 * 
	 * O símbolo ( representa "maior que". Por exemplo: [0,25] indica valores entre
	 * 0 e 25.0000, inclusive eles. (25,50] indica valores maiores que 25 Ex:
	 * 25.00001 até o valor 50.0000000
	 * 
	 * Entrada O arquivo de entrada contém um número com ponto flutuante qualquer.
	 * 
	 * Saída A saída deve ser uma mensagem conforme exemplo abaixo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numeroDigitado = sc.nextDouble();

		if (numeroDigitado >= 0 && numeroDigitado <= 25) {

			System.out.println("Intervalo [0,25]");
		
		}else if (numeroDigitado > 25 && numeroDigitado <= 50) {
		
			System.out.println("Intervalo (25,50]");
		
		} else if (numeroDigitado > 50 && numeroDigitado <= 100) {
			
			System.out.println("Intervalo (75,100]");
		} 
		else {
		
			System.out.println("Fora de intervalo");
		
		}

		sc.close();
	}

}
