package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro N que � a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. 
Voc� deve apresentar a soma de Y �mpares consecutivos a partir de X inclusive 
o pr�prio X se ele for �mpar. Por exemplo:
para a entrada 4 5, a sa�da deve ser 45, que � equivalente �: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a sa�da deve ser 40, que � equivalente �: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada � um inteiro N que � a quantidade de casos de teste que vem a seguir.
 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Sa�da
Imprima a soma dos consecutivos n�meros �mpares a partir do valor X.
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