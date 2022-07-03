package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		/*double x;
		System.out.println("Digite um número ");
		x = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n" , x );*/
		
		/*char x;
		x = sc.next().charAt(0); 
		System.out.println("Você digitou: " + x );		*/
		
	/*	String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n",z); */
		
		
		
	/*	String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.printf(s3); */
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine(); // Limpar buffer, consumir quebra de linha pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.printf(s3);
		
		
		sc.close();
	}

}
