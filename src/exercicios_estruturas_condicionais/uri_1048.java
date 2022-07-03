package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1048 {

	/*
	 * A empresa ABC resolveu conceder um aumento de sal�rios a seus funcion�rios de
	 * acordo com a tabela abaixo:
	 * 
	 * 
	 * Sal�rio Percentual de Reajuste
	 *  0 - 400.00 --------15%
	 *  400.01 - 800.00 ---12% 
	 *  800.01 - 1200.00 --10%
	 *  1200.01 - 2000.00 --7% 
	 *  Acima de 2000.00 ---4%
	 *  
	 * 
	 * Leia o sal�rio do funcion�rio e calcule e mostre o novo sal�rio, bem como o
	 * valor de reajuste ganho e o �ndice reajustado, em percentual.
	 * 
	 * Entrada A entrada cont�m apenas um valor de ponto flutuante, com duas casas
	 * decimais.
	 * 
	 * Sa�da Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e
	 * o percentual de reajuste ganho, conforme exemplo abaixo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioAtual, salarioReajustado, reajusteGanho;

		salarioAtual = sc.nextDouble();
		
		if (salarioAtual > 0.00 && salarioAtual <= 400.00) {
			
			salarioReajustado = salarioAtual + salarioAtual * 0.15;
			reajusteGanho = salarioReajustado - salarioAtual;
			
			System.out.printf("Novo salario: %.2f%n", salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 15 %");
			
		} else if (salarioAtual >= 400.01 && salarioAtual <= 800.00) {
			
			salarioReajustado = salarioAtual + salarioAtual * 0.12;
			reajusteGanho = salarioReajustado - salarioAtual;
			
			System.out.printf("Novo salario: %.2f%n", salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 12 %");
			
		} else if (salarioAtual >= 800.01 && salarioAtual <= 1200.00) {
			
			salarioReajustado = salarioAtual + salarioAtual * 0.10;
			reajusteGanho = salarioReajustado - salarioAtual;
			
			System.out.printf("Novo salario: %.2f%n", salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 10 %");
			
		} else if (salarioAtual >= 1200.01 && salarioAtual <= 2000.00) {
			
			salarioReajustado = salarioAtual + salarioAtual * 0.07;
			reajusteGanho = salarioReajustado - salarioAtual;
			
			System.out.printf("Novo salario: %.2f%n", salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 7 %");
			
		}else {
			
			salarioReajustado = salarioAtual + salarioAtual * 0.04;
			reajusteGanho = salarioReajustado - salarioAtual;
			
			System.out.printf("Novo salario: %.2f%n", salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 4 %");
			
		}

		sc.close();
	}

}
