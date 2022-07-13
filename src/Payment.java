import java.util.Locale;
import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double value, payment;
		int hours;
		
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		value = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		hours = sc.nextInt();
		
		payment = value * hours;
		
		System.out.print("O pagamento para " + name + " deve ser " + String.format("%.2f", payment));
		
		sc.close();
		
	}

}
