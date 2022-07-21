import java.util.Locale;
import java.util.Scanner;

public class MainMatrix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, line, column;
		double sumPositive;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] matrix = new double[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matrix[i][j] = sc.nextDouble();
			}
		}
		
		sumPositive = 0;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (matrix[i][j] > 0) {
					sumPositive = sumPositive + matrix[i][j];
				}
			}
		}
		
		System.out.println("\nSoma dos positivos = " + String.format("%.1f", sumPositive));
		
		System.out.print("\nEscolha uma linha: ");
		line = sc.nextInt();
		
		System.out.print("Linha escolhida: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", matrix[line][i]) + " ");
		}
		
		System.out.print("\n\nEscolha uma coluna: ");
		column = sc.nextInt();
		
		System.out.print("Coluna escolhida: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", matrix[i][column]) + " ");
		}
		
		System.out.print("\n\nDiagonal principal: ");
		for (i = 0; i < n; i++) {
				System.out.print(String.format("%.1f", matrix[i][i]) + " ");
		}
		
		System.out.println("\n\nMatriz alterada:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (matrix[i][j] < 0) {
					matrix[i][j] = Math.pow(matrix[i][j], 2);
				}
				System.out.print(String.format("%.1f", matrix[i][j]) + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
