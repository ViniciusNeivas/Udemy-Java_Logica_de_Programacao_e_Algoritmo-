package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina 
e precisa de sua ajuda para organizar os experimentos de um laboratório 
o qual ela é responsável. 
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório
e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: 
sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos 
que foram realizados, o tipo de cobaia utilizada 
e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários 
casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa 
a quantidade de cobaias utilizadas e um caractere 
Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada 
e o percentual de cada uma em relação ao total de cobaias utilizadas, 
sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
*/


public class uri_1094 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int coelhos = 0;
		int ratos =0;
		int sapos = 0;
	
		
		for (int i=0; i<n; i++) {
	
			int qtd = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if (tipo == 'C') {
				
				coelhos = coelhos + qtd;
				
			}
			else if (tipo == 'R') {
				
				ratos = ratos + qtd;
				
			}
			else {
				
				sapos = sapos + qtd;
			}
		}
			
			int total = coelhos + ratos + sapos;
			
			double porcentagemCoelhos = (double) coelhos/total * 100;
			double porcentagemRatos = (double) ratos/total * 100;
			double porcentagemSapos = (double) sapos/total * 100;
		
			System.out.println("Total: " + total + " cobaias");
			System.out.println("Total de coelhos: " + coelhos);
			System.out.println("Total de ratos: " + ratos);
			System.out.println("Total de sapos: " + sapos);
			System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);
		
			sc.close();
	}
}