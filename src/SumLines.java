import java.util.Locale;
import java.util.Scanner;

public class SumLines {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, m;
		double sumLines;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		double[][] matrix = new double[m][n];
		
		for (i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (j = 0; j < n; j++) {
				matrix[i][j] = sc.nextDouble();
			}
		}
		
		double[] array = new double[m];
		
		for (i = 0; i < m; i++) {
			sumLines = 0;
			for (j = 0; j < n; j++) {
				sumLines = sumLines + matrix[i][j];
			}
			array[i] = sumLines;
		}
		
		System.out.println("Vetor gerado:");
		
		for (i = 0; i <m; i++)
			System.out.println(String.format("%.1f", array[i]));
		
		sc.close();

	}

}
