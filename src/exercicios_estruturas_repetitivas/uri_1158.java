package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. 
Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive 
o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.
*/
public class uri_1158 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
	for (int i=0; i<n; i++) {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = 0;
		int cont = 0;
		
		for (int j=x; cont <y; j++) {
			
			if (j % 2 != 0) {
				
				soma = soma + j;
				cont = cont + 1;
				
			}
			
		}
		
		System.out.println(soma);
	}
		
		sc.close();
	}
}