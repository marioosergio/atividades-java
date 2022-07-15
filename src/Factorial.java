import java.util.Locale;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, factorial;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("FATORIAL = " + factorial);
		
		sc.close();
	}

}
