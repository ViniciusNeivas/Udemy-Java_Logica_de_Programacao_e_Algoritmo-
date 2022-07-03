package exercicios_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class uri_1046 {

	/*
	 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A
	 * seguir calcule a duração do jogo.
	 * 
	 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
	 * 
	 * Entrada Quatro números inteiros representando a hora de início e fim do jogo.
	 * 
	 * Saída Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hi, mi, hf, mf, deltaHoras, deltaMinutos;

		hi = sc.nextInt();
		mi = sc.nextInt();
		hf = sc.nextInt();
		mf = sc.nextInt();

		deltaHoras = hf - hi;
		deltaMinutos = mf - mi;

		if (deltaHoras == 0 && deltaMinutos > 0) {

			deltaMinutos = deltaMinutos + 0;

			System.out.println("O JOGO DUROU 24 HORA(S) E " + deltaMinutos + " MINUTO(S)");

		} else if (deltaHoras == 0) {

			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}

		else if (hi > hf || mi > mf) {

			deltaHoras = deltaHoras * 0;
			deltaMinutos = deltaMinutos + 60;

			System.out.println("O JOGO DUROU " + deltaHoras + " HORA(S) E " + deltaMinutos + " MINUTO(S)");
		}

		else {

			System.out.println("O JOGO DUROU " + deltaHoras + " HORA(S) E " + deltaMinutos + " MINUTO(S)");
		}

		sc.close();
	}

}
