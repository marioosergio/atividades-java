import java.util.Locale;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double sum, average;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] array = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			}
		
		System.out.println();
		System.out.print("VALORES = ");
		sum = 0;
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", array[i]) + " ");
			sum = sum + array[i];
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.1f", sum));
		
		average = sum / n;
		System.out.println("MEDIA = " + String.format("%.1f", average));
		
		sc.close();
	}

}