package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
 *Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. 
 *Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *
 *Entrada
 *O arquivo de entrada cont�m um valor inteiro N na primeira linha. 
 *Cada N linha a seguir cont�m um caso de teste com tr�s valores com uma casa decimal cada valor.
 *
 *Sa�da
 *
 *Para cada caso de teste, imprima a m�dia ponderada dos 3 valores, conforme exemplo abaixo.
 */
public class uri_1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}
}