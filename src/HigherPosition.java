import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, higherPosition;
		double higherValue;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] array = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			}
		
		higherValue = array[0];
		higherPosition = 0;
		for (i = 1; i < n; i++) {
			if (array[i] > higherValue) {
				higherValue = array[i];
				higherPosition = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + String.format("%.1f", higherValue));
		System.out.println("POSICAO DO MAIOR VALOR = " + higherPosition);
		
		sc.close();

	}

}
