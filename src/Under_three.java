import java.util.Locale;
import java.util.Scanner;

public class Under_three {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, under;
		
		System.out.print("Primeiro valor: ");
		x = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		y = sc.nextInt();
		
		System.out.print("Terceiro valor: ");
		z = sc.nextInt();
		
		if (x < y && x < z) {
			under = x;
		}
		else if (y < z) {
			under = y;
		}
		else {
			under = z;
		}
		
		System.out.println("MENOR = " + under);
		
		sc.close();
		
	}

}
