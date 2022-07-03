package exercicios_estruturas_repetitivas;
import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido2 {
/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
Escreva para cada X e Y uma mensagem que indique se estes valores 
foram digitados em ordem crescente ou decrescente.

Entrada
A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores inteiros X e Y. 
A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Sa�da
Para cada caso de teste imprima �Crescente�, 
caso os valores tenham sido digitados na ordem crescente, 
caso contr�rio imprima a mensagem �Decrescente�		
*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while ( idade >= 1) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		} 
		if (cont > 0) {
			double media = (double) soma/cont;
			System.out.printf("%.2f%n", media);
		} 
		else {
			System.out.println("imposs�vel calcular");
		}
		sc.close();
	}

}
