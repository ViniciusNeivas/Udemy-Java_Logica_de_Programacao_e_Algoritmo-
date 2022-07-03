package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) 
e o total de combust�vel gasto (em litros).

Entrada
O arquivo de entrada cont�m dois valores: 
um valor inteiro X representando a dist�ncia total percorrida (em Km), 
e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

Sa�da
Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, 
seguido da mensagem "km/l".
*/

public class uri_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int X;
		double Y, consumoMedio;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		
		
		consumoMedio = (X / Y) ;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		 
		sc.close();
	}

}
