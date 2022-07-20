import java.util.Locale;
import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, amount;
		double averageHeight, totalHeight, underAgePercent;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a " + "pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			}
		
		totalHeight = 0;
		amount = 0;
		for (i = 0; i < n; i++) {
			if (age[i] < 16.0) {
				amount++;
			}
			totalHeight = totalHeight + height[i];
		}
		
		averageHeight = totalHeight / n;
		System.out.println("\nAltura media: " + String.format("%.2f", averageHeight));
		
		underAgePercent = amount * 100 / n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", underAgePercent) + "%");
		
		for (i = 0; i < n; i++) {
			if (age[i] < 16.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}