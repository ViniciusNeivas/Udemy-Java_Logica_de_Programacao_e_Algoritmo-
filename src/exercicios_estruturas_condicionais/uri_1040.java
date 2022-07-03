package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1040 {

	/*
	 * Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal,
	 * correspondente �s quatro notas de um aluno. Calcule a m�dia com pesos 2, 3, 4
	 * e 1, respectivamente, para cada uma destas notas e mostre esta m�dia
	 * acompanhada pela mensagem "Media: ". Se esta m�dia for maior ou igual a 7.0,
	 * imprima a mensagem "Aluno aprovado.". Se a m�dia calculada for inferior a
	 * 5.0, imprima a mensagem "Aluno reprovado.". Se a m�dia calculada for um valor
	 * entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem
	 * "Aluno em exame.".
	 * 
	 * No caso do aluno estar em exame, leia um valor correspondente � nota do exame
	 * obtida pelo aluno. Imprima ent�o a mensagem "Nota do exame: " acompanhada
	 * pela nota digitada. Recalcule a m�dia (some a pontua��o do exame com a m�dia
	 * anteriormente calculada e divida por 2). e imprima a mensagem
	 * "Aluno aprovado." (caso a m�dia final seja 5.0 ou mais ) ou
	 * "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). Para estes dois
	 * casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima linha
	 * uma mensagem "Media final: " seguido da m�dia final para esse aluno.
	 * 
	 * Entrada A entrada cont�m quatro n�meros de ponto flutuante correspendentes as
	 * notas dos alunos.
	 * 
	 * Sa�da Todas as respostas devem ser apresentadas com uma casa decimal. As
	 * mensagens devem ser impressas conforme a descri��o do problema. N�o esque�a
	 * de imprimir o enter ap�s o final de cada linha, caso contr�rio obter�
	 * "Presentation Error".
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float nota1, nota2, nota3, nota4, media;
		
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		
		
		media = ((nota1 * 2f) + (nota2 * 3f) + (nota3 * 4f) + (nota4 * 1f)) / 10f;
		
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7f && media <= 10f) {
			
			System.out.println("Aluno aprovado.");
			
		}else if (media < 5f) {
			
			System.out.println("Aluno reprovado.");
			
		}
		
		else {
			
			System.out.println("Aluno em exame.");
			
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			
			float mediaExame = (notaExame + media)/ 2f;
			
			if (mediaExame >= 5f & mediaExame<= 10f) {
				
				System.out.println("ALuno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			
				 System.out.printf("Media final: %.1f%n", mediaExame );
			
		}
			
		
		
		sc.close();
	}

}
