import java.util.Locale;
import java.util.Scanner;

public class Money_change {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, money, moneyChange;
		int amount;
		
		System.out.print("Preço unitario do produto: ");
		price = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		sc.nextLine();
		amount = sc.nextInt();

		System.out.print("Dinheiro recebido: ");
		sc.nextLine();
		money = sc.nextDouble();
		
		moneyChange = money - price * amount;
		System.out.print("TROCO = " + String.format("%.2f", moneyChange));
		
		sc.close();
		
		
	}

}
