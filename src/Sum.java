import java.util.Locale;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int x, y, sum;
			
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
			
		System.out.print("Digite o valor de Y: ");
		sc.nextLine();
		y = sc.nextInt();
			
		sum = x + y;
		System.out.print("SOMA: " + sum);
			
		sc.close();
		
		
	}

}
