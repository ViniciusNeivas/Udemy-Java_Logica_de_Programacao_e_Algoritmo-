package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
Em seguida, calcule e mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
Entrada
O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.

Sa�da
O arquivo de sa�da dever� conter 5 linhas de dados. 
Cada linha corresponde a uma das �reas descritas acima, 
sempre com mensagem correspondente e um espa�o entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.
*/

public class uri_1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		double A, B, C, pi = 3.14159, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		A = sc.nextDouble();
	
		B = sc.nextDouble();
	
		C = sc.nextDouble();
		
		areaTriangulo = A * C / 2.0;
		
		areaCirculo = pi * Math.pow(C, 2.0);
		
		areaTrapezio = (A + B) * C / 2.0;
		
		areaQuadrado = Math.pow(B, 2.0);
		
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
		sc.close();
	}

}
