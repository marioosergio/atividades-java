import java.util.Locale;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit, celsius;
		char temperature;
		
		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		temperature = sc.next().charAt(0);
		
		if (temperature == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			
			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.print("Temperatura equivalente em Celcius: " + String.format("%.2f", celsius));
		}

		else {
			System.out.print("Digite a temperatura em Celcius: ");
			celsius = sc.nextDouble();
			fahrenheit = celsius * 9.0 / 5.0 + 32.0;
			System.out.print("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", fahrenheit));
		}
		
		sc.close();
		
	}

}
