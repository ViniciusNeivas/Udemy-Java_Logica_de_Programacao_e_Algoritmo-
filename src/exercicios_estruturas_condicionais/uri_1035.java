package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1035 {

	/*
	 Com base na tabela abaixo, escreva um programa que leia o código de um item 
	 e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.



Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, d;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if (a % 2 != 0 || c < 0 || d < 0) {

			System.out.println("Valores nao aceitos");

		} else if (b > c && d > a && (c + d) > (a + b)) {

			System.out.println("Valores aceitos");

		} else {
			System.out.println("Valores nao aceitos");
		}

		sc.close();
	}

}
