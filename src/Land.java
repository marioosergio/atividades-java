import java.util.Locale;
import java.util.Scanner;


public class Land {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, length, value, area, price;
		
		System.out.print("Digite a largura do terreno: ");
		width = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		length = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		value = sc.nextDouble();

		area = width * length;
		System.out.println("Área do Terrento = " + String.format("%.2f", area));
		
		price = area * value;
		System.out.println("Preco do Terreno = " + String.format("%.2f", price));
		
		sc.close();
		
	}

}