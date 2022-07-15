import java.util.Locale;
import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age, amount;
		double sum, average;
		
		System.out.println("Digite as idades:");
		age = sc.nextInt();
		
		if (age < 0) {
			System.out.println("IMPOSSIVEL CALCULAR!");
		}
		else {
			sum = 0;
			amount = 0;
			while (age >= 0) {
				sum = age + sum;
				amount++;
				
				age = sc.nextInt();
			}
			
		average = sum / amount;
		System.out.println("Media = " + String.format("%.2f", average));
			
		}
		
		sc.close();
		
	}

}
