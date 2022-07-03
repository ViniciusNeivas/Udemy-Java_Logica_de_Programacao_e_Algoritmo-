package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, 
mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:

Distancia =

Entrada
O arquivo de entrada cont�m duas linhas de dados. 
A primeira linha cont�m dois valores de ponto flutuante: x1 y1 
e a segunda linha cont�m dois valores de ponto flutuante x2 y2.

Sa�da
Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, 
com 4 casas ap�s o ponto decimal.
*/

public class uri_1015 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		double X2, X1, Y2, Y1, distancia;
		
	
		X1 = sc.nextDouble();
		Y1 = sc.nextDouble();
		X2 = sc.nextDouble();
		Y2 = sc.nextDouble();
		
		distancia = Math.sqrt((Math.pow(X2-X1, 2)) + (Math.pow(Y2-Y1, 2))) ;
		
		System.out.printf("%.4f%n",distancia);
		
		 
		sc.close();
	}

}
