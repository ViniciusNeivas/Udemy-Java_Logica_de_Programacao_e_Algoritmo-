package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;
/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
  */
public class uri_1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		double n;
		int resto, nota, moeda, quosciente;
		
		n = sc.nextDouble();
		
		resto = (int) (n * 100.0 + 0.5) ;
		
		System.out.println("NOTAS:");
		
		nota = 100;
		quosciente = resto / (nota * 100) ;
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
	
		
		nota = 50;
		quosciente = resto / (nota * 100) ;
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100) ;
		
	
		
		nota = 20;
		quosciente = resto  / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		

		
		nota = 10;
		quosciente = resto  / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100) ;
		
		
		
		
		nota = 5;
		quosciente = resto  / (nota * 100) ;
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
	
		
		nota = 2;
		quosciente = resto  / (nota * 100) ;
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		

		
//      MOEDAS
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quosciente = resto / moeda ;
		System.out.println(quosciente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		
		
		moeda = 50;
		quosciente = resto / moeda ;
		System.out.println(quosciente + " moeda(s) de R$ 0." + moeda);
		resto = resto % moeda;
	
		
		
		moeda = 25;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0." + moeda);
		resto = resto % moeda;
			
		
		moeda = 10;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0." + moeda);
		resto = resto % moeda;
			
		
		moeda = 5;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0.0" + moeda);
		resto = resto % moeda;
			
		
		moeda = 1;		
		System.out.println(resto + " moeda(s) de R$ 0.0" + moeda);

		
		
		sc.close();

	}

}
