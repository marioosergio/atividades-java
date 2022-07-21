import java.util.Locale;
import java.util.Scanner;

public class EachLine {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, higher;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Maior elemento de cada linha:");
		
		for (i = 0; i < n; i++) {
			higher = matrix[i][0];
			for (j = 1; j < n; j++) {
				if (higher < matrix[i][j]) {
					higher = matrix[i][j];
				}
			}
			System.out.println(higher);
		}
		
		sc.close();

	}

}
