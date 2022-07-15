import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double x, y, z, average;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		average = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			average = (x * 2 + y * 3 + z * 5) / 10;
			System.out.println("MEDIA = " + String.format("%.1f", average));
		}
		
		sc.close();
		
	}

}
