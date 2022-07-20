import java.util.Locale;
import java.util.Scanner;

public class Merchant {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, below, between, above;
		double totalBuy, totalSell, totalProfit;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		double[] buyPrice = new double[n];
		double[] sellPrice = new double[n];
		double[] profitPercent = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			buyPrice[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			sellPrice[i]= sc.nextDouble();
			
		}
		
		for (i = 0; i < n; i++) {
			profitPercent[i] = (sellPrice[i] - buyPrice[i]) / buyPrice[i] * 100;
		}
		
		below = 0;
		between = 0;
		above = 0;
		
		for (i = 0; i < n; i++) {
			if (profitPercent[i] < 10.0) {
				below++;
			}
			else if (profitPercent[i] < 20.0) {
				between++;
			}
			else {
				above++;
			}
		}
		
		totalBuy = 0;
		totalSell = 0;
		for (i = 0; i < n; i++) {
			totalBuy = totalBuy + buyPrice[i];
			totalSell = totalSell + sellPrice[i];
		}
		
		totalProfit = totalSell - totalBuy;
		
		System.out.println("\nRELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + below);
		System.out.println("Lucro entre 10% e 20%: " + between);
		System.out.println("Lucro acima de 20%: " + above);
		System.out.println("Valor total da compra: " + String.format("%.2f", totalBuy));
		System.out.println("Valor total da venda: " + String.format("%.2f", totalSell));
		System.out.println("Lucro total: " + String.format("%.2f", totalProfit));

		sc.close();

	}

}