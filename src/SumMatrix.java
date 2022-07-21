import java.util.Locale;
import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, m, n;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
		
		int[][] matrixA = new int[m][n];
		int[][] matrixB = new int[m][n];
		int[][] sumMatrix = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrixA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrixB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Soma das matrizes:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	
		sc.close();
	}

}
