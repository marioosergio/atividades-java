import java.util.Locale;
import java.util.Scanner;

public class Older {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, older, olderName;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		older = age[0];
		olderName = 0;
		for (i = 1; i < n; i++) {
			if (age[i] > older) {
				older = age[i];
				olderName = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + name[olderName]);
		
		sc.close();
		
	}

}
