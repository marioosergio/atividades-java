import java.util.Locale;
import java.util.Scanner;

public class DiagonalAbove {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, diagonalAbove;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		diagonalAbove = 0;
		
		for (i = 0; i < n; i++) {
			for (j = 1; j < n; j++) {
				if (i < j) {
					diagonalAbove = matrix[i][j] + diagonalAbove;
				}
			}
		}
		
		System.out.println("Soma dos elementos acima da diagonal principal = " + diagonalAbove);
		
		sc.close();
	
	}

}
