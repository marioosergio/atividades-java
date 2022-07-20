import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double sumArray, average;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] array = new double[n];
		
		sumArray = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			sumArray = sumArray + array[i];
		}
		
		average = sumArray / n;
		System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", average));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (i = 0; i < n; i++) {
			if (array[i] < average) {
				System.out.println(array[i]);
			}
		}
		
		sc.close();

	}

}
