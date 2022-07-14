import java.util.Locale;
import java.util.Scanner;

public class Cafeteria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, amount;
		double price;
		
		System.out.print("Codigo do produto comprado: ");
		code = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		amount = sc.nextInt();
		
		price = 0;
		
		if (code == 1) {
			price = amount * 5.00;
		}
		else if (code == 2) {
			price = amount * 3.50;
		}
		else if (code == 3) {
			price = amount * 4.80;
		}
		else if (code == 4) {
			price = amount * 8.90;
		}
		else if (code == 5) {
			price = amount * 7.32;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", price));
		
		sc.close();
		
	}

}
