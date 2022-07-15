import java.util.Locale;
import java.util.Scanner;

public class Fuel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, gasoline, alcohol, diesel;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		code = sc.nextInt();
		
		gasoline = 0;
		alcohol = 0;
		diesel = 0;
		
		while (code != 4) {
			if (code == 1) {
				alcohol++;
			}
			else if (code == 2) {
				gasoline++;
			}
			else if (code == 3) {
				diesel++;
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			code = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
	    System.out.println("Alcool: " + alcohol);
	    System.out.println("Gasolina: " + gasoline);
	    System.out.println("Diesel: " + diesel);
		
	    sc.close();
		
	}

}
