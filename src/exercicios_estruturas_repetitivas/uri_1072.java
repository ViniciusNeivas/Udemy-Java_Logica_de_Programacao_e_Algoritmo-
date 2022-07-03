package exercicios_estruturas_repetitivas;

import java.util.Scanner;

/*
 *Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
 *Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, 
 *mostrando essas informa��es.
 *
 *Entrada
 *
 *A primeira linha da entrada cont�m um valor inteiro N (N < 10000), 
 *que indica o n�mero de casos de teste.
 *Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
 *
 *Sa�da
 *
 *Para cada caso, imprima quantos n�meros est�o dentro (in) 
 *e quantos valores est�o fora (out) do intervalo.


 *
*/
public class uri_1072 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int out = 0;
		int in = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {

				in = in + 1;

			} else {

				out = out + 1;

			}

		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}