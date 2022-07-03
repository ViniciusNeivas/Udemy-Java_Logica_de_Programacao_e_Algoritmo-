package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
*/
public class uri_1157 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				System.out.println(i);

			}

		}

		sc.close();
	}
}