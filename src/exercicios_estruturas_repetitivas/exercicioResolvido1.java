package exercicios_estruturas_repetitivas;
import java.util.Scanner;

public class exercicioResolvido1 {
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
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ( x != y) {
			if (x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
		
			x = sc.nextInt();
			y = sc.nextInt();		
			
		}
		
		sc.close();
	}

}
