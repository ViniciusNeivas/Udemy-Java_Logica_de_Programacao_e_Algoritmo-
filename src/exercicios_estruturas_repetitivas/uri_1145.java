package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequ�ncia de 1 at� Y,
 passando para a pr�xima linha a cada X n�meros.

Entrada
O arquivo de entrada cont�m dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Sa�da
Cada sequ�ncia deve ser impressa em uma linha apenas, com 1 espa�o em branco entre cada n�mero, 
conforme exemplo abaixo. N�o deve haver espa�o em branco ap�s o �ltimo valor da linha.
*/
public class uri_1145 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i=1; i<=y; i++) {
			
			System.out.print(i);
			
			if (i % x ==0) {
				
				System.out.println();
			
			}
			else {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}