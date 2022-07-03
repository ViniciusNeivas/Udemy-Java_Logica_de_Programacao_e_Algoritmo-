package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1048 {

	/*
	 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
	 * acordo com a tabela abaixo:
	 * 
	 * 
	 * Salário Percentual de Reajuste
	 *  0 - 400.00 --------15%
	 *  400.01 - 800.00 ---12% 
	 *  800.01 - 1200.00 --10%
	 *  1200.01 - 2000.00 --7% 
	 *  Acima de 2000.00 ---4%
	 *  
	 * 
	 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o
	 * valor de reajuste ganho e o índice reajustado, em percentual.
	 * 
	 * Entrada A entrada contém apenas um valor de ponto flutuante, com duas casas
	 * decimais.
	 * 
	 * Saída Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e
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
