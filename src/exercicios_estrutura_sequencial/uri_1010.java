package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, 
o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. 
Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto.
*/

public class uri_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valUnitPeca1, valUnitPeca2, valorPagar;
		
		codPeca1 = sc.nextInt();
		
		qtdPeca1 = sc.nextInt();
		
		valUnitPeca1 = sc.nextDouble();
	
		
		codPeca2 = sc.nextInt();
		
		qtdPeca2 = sc.nextInt();
		
		valUnitPeca2 = sc.nextDouble();
		
		
		valorPagar = (qtdPeca1 * valUnitPeca1) + (qtdPeca2 * valUnitPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		
		sc.close();
	}

}
