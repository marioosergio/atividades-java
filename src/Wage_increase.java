import java.util.Locale;
import java.util.Scanner;

public class Wage_increase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double wage, newWage, increase;
		int percent;
		
		System.out.print("Digite o salario da pessoa: R$ ");
		wage = sc.nextDouble();

		if (wage <= 1000.00) {
			percent = 20;
			increase = wage * percent / 100;
			newWage = wage + increase;
		}
		else if  (wage <= 3000.00) {
			percent = 15;
			increase = wage * percent / 100;
			newWage = wage + increase;
		}
		else if (wage <= 8000.00) {
			percent = 10;
			increase = wage * percent / 100;
			newWage = wage + increase;
		}
		else {
			percent = 5;
			increase = wage * percent / 100;
			newWage = wage + increase;
		}
		
		System.out.println("Novo salario = R$ " + String.format("%.2f", newWage));
		System.out.println("Aumento = R$ " + String.format("%.2f", increase));
		System.out.println("Porcentagem = " + percent + "%");
		
		sc.close();
		
	}

}
