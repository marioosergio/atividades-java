import java.util.Locale;
import java.util.Scanner;

public class SumOdds {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, sum, swap;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			swap = x;
			x = y;
			y = swap;
		}
		
		sum = 0;
		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}

		System.out.println("SOMA DOS IMPARES = " + sum);
		
		sc.close();
		
	}

}
