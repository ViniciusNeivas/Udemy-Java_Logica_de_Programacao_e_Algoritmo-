package exercicios_estruturas_condicionais;
import java.util.Locale;
import java.util.Scanner;

public class uri_1036 {

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
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);	
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);	
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		
		sc.close();
	}

}
