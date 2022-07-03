package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
	Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos n�meros 
	que n�o s�o m�ltiplos de 13 entre X e Y, incluindo ambos.
	
	Entrada
	
	O arquivo de entrada cont�m 2 valores inteiros quaisquer, n�o necessariamente em ordem crescente.
	
	Sa�da
	
	Imprima a soma de todos os valores n�o divis�veis por 13 entre os dois valores lidos na entrada, 
	inclusive ambos se for o caso.
 
 */
public class uri_1132 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor = x;
		int maior = y;
		
		if (x > y) {
			
			menor = y;
			maior = x;
			
		}
		
		int soma = 0;
		
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}