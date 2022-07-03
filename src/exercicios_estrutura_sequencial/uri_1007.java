package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Timelimit: 1
Leia quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferen�a do produto de A e B pelo produto de C e D 
segundo a f�rmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada cont�m 4 valores inteiros.

Sa�da
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, 
conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
*/

public class uri_1007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}

}
