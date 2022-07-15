import java.util.Locale;
import java.util.Scanner;

public class ConsecutivePairs {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, sum;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}
			
			sum = 5 * x + 20;
			System.out.println("SOMA = " + sum);
			
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
			
		}
		
		sc.close();
		
	}

}
