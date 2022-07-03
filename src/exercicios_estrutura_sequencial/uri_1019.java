package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;
/*
 * Leia um valor inteiro, que � o tempo de dura��o em segundos de um 
 * determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada cont�m um valor inteiro N.

Sa�da
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo fornecido
 * 
 * 
 * 
 * */
public class uri_1019 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N /3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
	
		
		sc.close();

	}

}
