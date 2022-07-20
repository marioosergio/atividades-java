import java.util.Locale;
import java.util.Scanner;

public class SumArrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A:");
		
		int[] A = new int[n];
		
		for (i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		
		int[] B = new int[n];
		
		for (i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		int[] sumArrays = new int[n];
		
		for (i = 0; i < n; i++) {
			sumArrays[i] = A[i] + B[i];
			System.out.println(sumArrays[i]);
		}
		
		sc.close();

	}

}
