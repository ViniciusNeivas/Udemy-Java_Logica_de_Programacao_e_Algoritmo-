package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
 *Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o do primeiro pelo segundo. 
 *Caso n�o for poss�vel mostre a mensagem �divisao impossivel� para os valores em quest�o.
 *
 *Entrada
 *
 *A entrada cont�m um n�mero inteiro N. 
 *Este N ser� a quantidade de pares de valores inteiros (X e Y) que ser�o lidos em seguida.
 *
 *Sa�da
 *
 *Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto decimal, 
 *ou �divisao impossivel� caso n�o seja poss�vel efetuar o c�lculo.
 *
 *Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens 
 *como o C e C++ gera outro inteiro. Utilize cast :)
 
 */
public class uri_1116 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			double divisao;
			
			if (y == 0) {
				
				System.out.println("divisao impossivel");
				
			}else {
				
				divisao = (double) x / y;
				System.out.println(divisao);
				
			}
			
		}
	
		sc.close();
	}
}