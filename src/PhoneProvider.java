import java.util.Locale;
import java.util.Scanner;

public class PhoneProvider {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutes;
		double value;
		
		System.out.print("Digite a quantia de minutos: ");
		minutes = sc.nextInt();
		
		value = 50.0;
		
		if (minutes > 100) {
			value = value + 2 * (minutes - 100);
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", value));
		
		sc.close();
		
	}

}
