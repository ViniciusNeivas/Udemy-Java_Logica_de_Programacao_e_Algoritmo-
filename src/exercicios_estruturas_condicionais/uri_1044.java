package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1044 {

	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si.
	 * 
	 * Entrada A entrada cont�m valores inteiros.
	 * 
	 * Sa�da A sa�da deve conter uma das mensagens conforme descrito acima.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a %  b == 0 || b %  a == 0 ) {
			
			System.out.println("Sao Multiplos");
			
		} else {
			
			System.out.println("Nao sao Multiplos");
			
		}
		
		
		sc.close();
	}

}
