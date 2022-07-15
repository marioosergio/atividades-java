import java.util.Locale;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, in, out;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		x = sc.nextInt();
		
		in = 0;
		out = 0;
		for (int i = 0; i <= x; i++) {
			System.out.print("Digite um numero: ");
			y = sc.nextInt();
			
			if (y < 10 || y > 20) {
				out++;
			}
			else {
				in++;
			}
		}
		
		System.out.println(in + " DENTRO");
		System.out.println(out + " FORA");
		
		sc.close();
		
	}

}
