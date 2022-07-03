package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia um valor inteiro N.
 N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. 
 Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
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