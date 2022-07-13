import java.util.Locale;
import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distance;
		double fuel, consumption;
		
		System.out.print("Distancia percorrida: ");
		distance = sc.nextInt();
		
		System.out.print("Combustivel gasto: ");
		fuel = sc.nextDouble();
		
		consumption = distance / fuel;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumption));
		
		sc.close();

	}

}
