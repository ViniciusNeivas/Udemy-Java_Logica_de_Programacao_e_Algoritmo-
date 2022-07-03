package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, 
o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
Ap�s, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada cont�m duas linhas de dados. 
Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Sa�da
A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". 
O valor dever� ser apresentado com 2 casas ap�s o ponto.
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
