import java.util.Locale;
import java.util.Scanner;

public class Size {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, square, trapeze, triangle;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();
		
		square = a * a;
		triangle = (a * b) / 2.0;
		trapeze = ((a + b) * c) / 2;
		
		System.out.println("Area do quadrado: " + String.format("%.4f", square));
		System.out.println("Area do triangulo: " + String.format("%.4f", triangle));
		System.out.println("Area do trapezio: " + String.format("%.4f", trapeze));

		sc.close();
		
	}

}
