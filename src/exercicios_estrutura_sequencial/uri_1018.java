package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro. 
A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) 
no qual o valor pode ser decomposto.
As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a rela��o de notas necess�rias.

Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

Sa�da
Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, 
conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, 
caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
*/

public class uri_1018 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);

		int n, resto, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		
		n = sc.nextInt();
		resto = n;
		
		nota100 = n / 100;
		resto = resto % 100;
		
		nota50 = resto / 50;
		resto = resto % 50;
	
		nota20 = resto / 20;
		resto = resto % 20;
		
		nota10 = resto / 10;
		resto = resto % 10;
		
		nota5 = resto / 5;
		resto = resto % 5;
		
		nota2 = resto / 2;
		resto = resto % 2;
		
		nota1 = resto % 2;
		
		System.out.println(n);
		
		System.out.println(nota100 + " nota(s) de R$ 100,00 ");
		
		System.out.println(nota50 + " nota(s) de R$ 50,00 ");
		
		System.out.println(nota20 + " nota(s) de R$ 20,00 ");
		
		System.out.println(nota10 + " nota(s) de R$ 10,00 ");
		
		System.out.println(nota5 + " nota(s) de R$ 5,00 ");
		
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		System.out.println();
		
		sc.close();
	
		
	}
 
}
