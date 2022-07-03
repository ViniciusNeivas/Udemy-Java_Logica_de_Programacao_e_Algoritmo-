package exercicios_estruturas_condicionais;
import java.util.Locale;
import java.util.Scanner;

public class uri_1038 {

	/*
	 * Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. 
	 * Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, 
	 * caso haja uma divis�o por 0 ou raiz de numero negativo.

Entrada
Leia tr�s valores de ponto flutuante (double) A, B e C.

Sa�da
Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". 
Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem.
	 * 
	*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo;
		int quantidade;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			
			total = quantidade * 4.00;
			
		} else if (codigo == 2) {
			
			total = quantidade * 4.50;
		
		} else if (codigo == 3) {
			
			total = quantidade * 5.00;
			
		} else if (codigo == 4) {
			
			total = quantidade * 2.00;
			
		}else {
			
			total = quantidade * 1.50;
			
		}
		
		
		System.out.printf("Total: R$ %.2f%n",total);
		
		
		
		sc.close();
	}

}
