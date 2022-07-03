package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Dois carros (X e Y) partem em uma mesma dire��o. 
O carro X sai com velocidade constante de 60 Km/h 
e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X,
 ou seja, consegue se afastar um quil�metro a cada 2 minutos.

Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
tomar essa dist�ncia do outro carro.

Entrada
O arquivo de entrada cont�m um n�mero inteiro.

Sa�da
Imprima o tempo necess�rio seguido da mensagem "minutos".
*/

public class uri_1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int n, resultado;	// n = km resultado em minutos
		
		
		n = sc.nextInt();

		resultado = 2 * n;
		
		System.out.println(resultado + " minutos");
		
		 
		sc.close();
	}

}
