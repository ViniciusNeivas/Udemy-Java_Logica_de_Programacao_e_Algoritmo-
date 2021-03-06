package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia tr?s valores com ponto flutuante de dupla precis?o: A, B e C. 
Em seguida, calcule e mostre:
a) a ?rea do tri?ngulo ret?ngulo que tem A por base e C por altura.
b) a ?rea do c?rculo de raio C. (pi = 3.14159)
c) a ?rea do trap?zio que tem A e B por bases e C por altura.
d) a ?rea do quadrado que tem lado B.
e) a ?rea do ret?ngulo que tem lados A e B.
Entrada
O arquivo de entrada cont?m tr?s valores com um d?gito ap?s o ponto decimal.

Sa?da
O arquivo de sa?da dever? conter 5 linhas de dados. 
Cada linha corresponde a uma das ?reas descritas acima, 
sempre com mensagem correspondente e um espa?o entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 d?gitos ap?s o ponto decimal.
*/

public class uri_1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int A, B, C, maiorAB, maiorABC;
		
	
		A = sc.nextInt();
	
		B = sc.nextInt();
	
		C = sc.nextInt();
		
		maiorAB = (A + B + Math.abs(A - B)) / 2;
		
		maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
				
		System.out.println(maiorABC + " eh o maior");
		
		
		sc.close();
	}

}
