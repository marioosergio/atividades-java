import java.util.Locale;
import java.util.Scanner;

public class PairNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, amount;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		amount = 0;
		for (i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
				amount++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + amount);
		
		sc.close();

	}

}
