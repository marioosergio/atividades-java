import java.util.Locale;
import java.util.Scanner;

public class MoneyChangeVerified {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, money, moneyChange, remainder;
		int amount;
		
		System.out.print("Preço unitario do poduto: ");
		price = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		amount = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		money = sc.nextDouble();
		
		if (money >= price * amount) {
			moneyChange = money - price * amount;
			System.out.println("TROCO = " + String.format("%.2f", moneyChange));
		}
		
		else {
			remainder = price * amount - money;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", remainder) + " REAIS.");
		}
		
		sc.close();
		
	}

}
