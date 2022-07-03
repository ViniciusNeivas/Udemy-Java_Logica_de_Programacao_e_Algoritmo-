package exercicios_estruturas_condicionais;
import java.util.Locale;
import java.util.Scanner;

public class uri_1038 {

	/*
	 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
	 * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
	 * caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
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
