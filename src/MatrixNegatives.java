import java.util.Locale;
import java.util.Scanner;

public class MatrixNegatives {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, m, n;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Valores negativos:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (matrix[i][j] < 0) {
					System.out.println(matrix[i][j]);
				}
			}
		}
		
		sc.close();

	}

}
