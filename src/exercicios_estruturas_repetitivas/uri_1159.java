package exercicios_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
 *O programa deve ler um valor inteiro X indefinidas vezes. 
 *(O programa ir� parar quando o valor de X for igual a 0). 
 *Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par.
 * Se o valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da opera��o: 4+6+8+10+12, 
 * enquanto que se o valor de entrada for 11, por exempo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada cont�m muitos valores inteiros. O �ltimo valor do arquivo � zero.

Sa�da
Imprima a saida conforme a explica��o acima e o exemplo abaixo. 
*/
public class uri_1159 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		while (x != 0) {
			if ( x % 2 != 0) {
				x = x +1;
			}
			
			int soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			
			System.out.println(soma);
			
			x = sc.nextInt();
					
		}
		
		
		
		sc.close();
	}
}