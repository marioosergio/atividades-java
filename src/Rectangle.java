import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, height, area, perimeter, diagonally;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
				
		System.out.print("Altura do retangulo: ");
		height = sc.nextDouble();
		
		area = base * height;
		System.out.println("AREA = " + String.format("%.4f", area));
		
		perimeter = 2 * (base + height);
		System.out.println("Perimetro = " + String.format("%.4f", perimeter));
		
		diagonally = Math.sqrt(base * base + height * height);
		System.out.println("Diagonal = " + String.format("%.4f", diagonally));
		
		sc.close();
	
	}

}
