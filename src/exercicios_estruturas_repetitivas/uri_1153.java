package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
// Ler um valor N. Calcular e escrever seu respectivo fatorial. 
// Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//
//Entrada
//A entrada cont�m um valor inteiro N (0 < N < 13).
//
//Sa�da
//A sa�da cont�m um valor inteiro, correspondente ao fatorial de N.
 
*/
public class uri_1153 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= n; i++) {

			fatorial = fatorial * i;

		}

		System.out.println(fatorial);

//		

		sc.close();
	}
}