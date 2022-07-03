package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia um valor inteiro N.
 N * 2 linhas de sa�da ser�o apresentadas na execu��o do programa, seguindo a l�gica do exemplo abaixo. 
 Para valores com mais de 6 d�gitos, todos os d�gitos devem ser apresentados.

Entrada
O arquivo de entrada cont�m um n�mero inteiro positivo N (1 < N < 1000).

Sa�da
Imprima a sa�da conforme o exemplo fornecido.
*/
public class uri_1144 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int inicio = 1;

		
		for (int i = 1; i <= n; i++) {
			int segundo = 0;
			int terceiro = 0 ;	
			
			segundo = (int) Math.pow(inicio, 2);
			terceiro = (int) Math.pow(inicio, 3);
		
			
			System.out.printf("%d %d %d%n", inicio, segundo, terceiro);
			System.out.printf("%d %d %d%n", inicio, segundo + 1, terceiro + 1);

			
			inicio = inicio + 1;
		

			
		
		
			
		}

		sc.close();
	}
}