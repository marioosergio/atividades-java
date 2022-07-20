import java.util.Locale;
import java.util.Scanner;

public class PairAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, sumPair, amount;
		double pairAverage;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] array = new int[n];
		
		sumPair = 0;
		amount = 0;
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
			if (array[i] % 2 == 0) {
				sumPair = sumPair + array[i];
				amount++;
			}
		}
		
		if (amount == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			pairAverage = sumPair / amount;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", pairAverage));
		}
		
		sc.close();

	}

}
