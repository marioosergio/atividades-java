import java.util.Locale;
import java.util.Scanner;

public class Glucose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glucose;
		
		System.out.print("Digite a media da glicose: ");
		glucose = sc.nextDouble();
		
		System.out.print("Classificação: ");
		
		if (glucose <= 100) {
			System.out.println("Normal");
		}
		
		else if (glucose <= 140) {
			System.out.println("Elevado");
		}
		
		else {
			System.out.println("Diabetes");
		}
		
		sc.close();

	}

}
