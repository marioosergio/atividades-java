import java.util.Locale;
import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (i = 0; i < n; i++) {
			if (array[i] < 0) {
				System.out.println(array[i]);
			}
		}
		
		sc.close();

	}

}
