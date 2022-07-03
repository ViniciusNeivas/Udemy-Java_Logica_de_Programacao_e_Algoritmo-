package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
 *Fa�a um algoritmo para ler um n�mero indeterminado de dados, 
 *contendo cada um, a idade de um indiv�duo. 
 *O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa. 
 *Calcular e imprimir a idade m�dia deste grupo de indiv�duos.

Entrada
A entrada cont�m um n�mero indeterminado de inteiros. 
A entrada ser� encerrada quando um valor negativo for lido.

Sa�da
A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.

A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal. 
 
*/
public class uri_1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int contador = 0;
		int soma = 0;
		
		
		idade = sc.nextInt();
		
		
		while (idade >= 0 ) {
			
			contador = contador + 1;
			soma = soma + idade;
			idade = sc.nextInt();
		
		}
		
		if (idade < 0 ) {
		double media = (double) soma / contador;
		
		System.out.printf("%.2f%n", media);
		}
		sc.close();
	}
}