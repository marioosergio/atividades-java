import java.util.Locale;
import java.util.Scanner;

public class PeopleData {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, womenAmount, menAmount;
		double tallest, smallest, averageHeight, womenHeight;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] height = new double[n];
		char[] genre = new char[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			height[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genre[i] = sc.next().charAt(0);
		}
		
		smallest = height[0];
		tallest = height[0];
		for (i = 1; i < n; i++) {
			if (height[i] < smallest) {
				smallest = height[i];
			}
			if (height[i] > tallest) {
				tallest = height[i];
			}
		}
		
		womenHeight = 0;
		menAmount = 0;
		womenAmount = 0;
		for (i = 0; i < n; i++) {
			if (genre[i] == 'F') {
				womenHeight = womenHeight + height[i];
				womenAmount++;
			}
			else {
				menAmount++;
			}
		}
		
		if (womenAmount == 0) {
			System.out.println("Impossivel de calcular a altura das mulheres");
		}
		
		womenHeight = womenHeight / womenAmount;
		
		System.out.println("Menor Altura = " + String.format("%.2f", smallest));
		System.out.println("Maior Altura = " + String.format("%.2f", tallest));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", womenHeight));
		System.out.println("Numero de homens = " + menAmount);
		
		sc.close();

	}

}
