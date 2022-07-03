package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/
public class uri_1080 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior = sc.nextInt();
		int posicao = 1;

		for (int i = 2; i <= 100; i++) {

			int valorDigitado = sc.nextInt();
			if (valorDigitado > maior) {
				maior = valorDigitado;
				posicao = i;

			}

		}

		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}
}