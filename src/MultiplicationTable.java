import java.util.Locale;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, total;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			total = n * i;
					
			System.out.println(n + " X " + i + " = " + total);
		}
		
		sc.close();

	}

}
