package curso_programacao;
import java.util.Locale;

public class ExerciciosDeFixação {

	public static void main(String[] args) {

		// VARIAVEIS

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Product\n%s, which price is R$ %.2f.", product1, price1);
		System.out.printf("\n%s, which price is R$ %.2f.", product2, price2);
		System.out.println();
		System.out.printf("\nRecord: %d years old, code %d and gender: %s", age, code, gender);
		System.out.println();

		System.out.printf("Measue with eight decimal places: %f.", measure);
		System.out.printf("\nRouded (three decimal place): %.3f.", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f.", measure);

	}

}
