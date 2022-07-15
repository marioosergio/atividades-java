import java.util.Locale;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, y;
		double division;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				division = (double) x / y;
				System.out.println("DIVISAO = " + String.format("%.2f", division));
			}
			
		}
		
		sc.close();
		
	}

}
