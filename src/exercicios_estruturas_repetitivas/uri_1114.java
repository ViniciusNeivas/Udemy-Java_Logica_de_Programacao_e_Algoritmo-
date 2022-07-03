package exercicios_estruturas_repetitivas;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
Considere que a senha correta � o valor 2002. 

Entrada
A entrada � composta por v�rios casos de testes contendo valores inteiros.

Sa�da
Para cada valor lido mostre a mensagem correspondente � descri��o do problema.

*/
public class uri_1114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2002) {
		
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
	}
		System.out.println("Acesso Permitido");
		
		sc.close();
}
}