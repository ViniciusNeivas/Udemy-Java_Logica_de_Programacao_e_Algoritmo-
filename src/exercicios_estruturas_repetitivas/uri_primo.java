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
public class uri_primo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	
		
		
		
		
		
			
			if (n % 9 == 0 || n % 2 == 0 || n % 2 ==2 || n==2 ) {
				
				System.out.println("N�o � Primo");
				
			}
			else {
				
				System.out.println("� primo");
			}
			

		sc.close();
	
}
}