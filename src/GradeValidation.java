import java.util.Locale;
import java.util.Scanner;

public class GradeValidation {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double grade1, grade2, average;
		
		System.out.print("Digite a primeira nota: ");
		grade1 = sc.nextDouble();
		
		while (grade1 < 0 || grade1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			grade1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		grade2 = sc.nextDouble();
		
		while (grade2 < 0 || grade2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			grade2 = sc.nextDouble();
		} 
		
		average = (grade1 + grade2) / 2.0;
		System.out.println("MEDIA = " + String.format("%.2f", average));
	}

}
