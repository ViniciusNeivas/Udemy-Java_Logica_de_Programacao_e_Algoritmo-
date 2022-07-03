package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
 *Faça um algoritmo para ler um número indeterminado de dados, 
 *contendo cada um, a idade de um indivíduo. 
 *O último dado, que não entrará nos cálculos, contém o valor de idade negativa. 
 *Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. 
A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal. 
 
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