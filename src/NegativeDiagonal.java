import java.util.Locale;
import java.util.Scanner;

public class NegativeDiagonal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, negative;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		negative = 0;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] < 0) {
					negative++;
				}
			}
		}

		System.out.println("Diagonal Principal:");
		for (i = 0; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println("\nQuantidade de negativos = " + negative);
					
		sc.close();
	}

}
