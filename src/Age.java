import java.util.Locale;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		double averageAge;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		name1 = sc.nextLine();
		System.out.print("Idade: ");
		age1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("Idade: ");
		age2 = sc.nextInt();
		
		averageAge = (age1 + age2) / 2.0;
		System.out.println("A idade media de " + name1 + " e " + name2 + " é de " + averageAge + " anos.");
		
		sc.close();
		
	
	}

}
