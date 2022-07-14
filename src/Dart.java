import java.util.Locale;
import java.util.Scanner;

public class Dart {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, greaterDistance;
		
		System.out.println("Digite as tres distancias:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		if (x > y && x > z) {
			greaterDistance = x;
		}
		
		else if (y > z) {
			greaterDistance = y;
		}
		
		else {
			greaterDistance = z;
		}
		
		System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", greaterDistance));
		
		sc.close();
		
	}

}
