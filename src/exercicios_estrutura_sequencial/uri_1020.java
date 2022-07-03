package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;
/*
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, 
 * meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias,
 como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar 
 raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
  */
public class uri_1020 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int dias, idadeDias, idadeAnos, idadeMeses, resto;
		
		dias = sc.nextInt();
		
		idadeAnos = dias  / 365 ;
		resto = dias % 365;
		System.out.println(idadeAnos + " ano(s)");
		
		idadeMeses = resto / 30;
		resto = resto % 30;
		System.out.println(idadeMeses + " mes(es)");
		
		idadeDias = resto;
		System.out.println(idadeDias + " dia(s)");
	
		
		sc.close();

	}

}
