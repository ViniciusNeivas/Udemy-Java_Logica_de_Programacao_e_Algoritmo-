package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia um conjunto n�o determinado de pares de valores M e N 
(parar quando algum dos valores for menor ou igual a zero). 
Para cada par lido, mostre a sequ�ncia do menor at� o maior e a soma dos inteiros 
consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada cont�m um n�mero n�o determinado de valores M e N. 
A �ltima linha de entrada vai conter um n�mero nulo ou negativo.

Sa�da
Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a soma deles, 
conforme exemplo abaixo.
*/

public class uri_1101 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int maior = 0;
		int menor = 0;
		int soma = 0;

		while (m > 0 && n > 0) {

			if (m > n) {

				maior = m;
				menor = n;

			}

			for (int i = menor; i <= maior; i++) {

				soma += i;

				System.out.print(i + " ");

			}

			System.out.println("Sum=" + soma);
			
			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();

	}
}