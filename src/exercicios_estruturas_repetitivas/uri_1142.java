package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia um valor inteiro N. 
Este N � a quantidade de linhas de sa�da que ser�o apresentadas na execu��o do programa.

Entrada
O arquivo de entrada cont�m um n�mero inteiro positivo N.

Sa�da
Imprima a sa�da conforme o exemplo fornecido.
*/
public class uri_1142 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		int inicio = 1;
		
		for (int i=1; i<=n; i++) {
			
			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);
			
			inicio = inicio +4;
			
		}

		sc.close();
	}
}