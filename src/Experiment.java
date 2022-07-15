import java.util.Locale;
import java.util.Scanner;

public class Experiment {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, amount, frog, rabbit, rat, total;
		char kind;
		double percentFrog, percentRabbit, percentRat;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();
		
		frog = 0;
		rabbit = 0;
		rat = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			amount = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			kind = sc.next().charAt(0);
			
			if (kind == 'S') {
				frog = frog + amount;
			}
			else if (kind == 'C') {
				rabbit = rabbit + amount;
			}
			else {
				rat = rat + amount;
			}

		}
		
		total = frog + rabbit + rat;
		
		percentFrog = ((double) frog / total) * 100.0;
		percentRabbit = ((double) rabbit / total) * 100.0;
	    percentRat = ((double) rat / total) * 100.0;
		
		System.out.println("\nRELATORIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + rabbit);
		System.out.println("Total de ratos: " + rat);
		System.out.println("Total de sapos: " + frog);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percentRabbit));
		System.out.println("Percentual de ratos: " + String.format("%.2f", percentRat));
		System.out.println("Percentual de sapos: " + String.format("%.2f", percentFrog));
		
		sc.close();
		
	}

}
