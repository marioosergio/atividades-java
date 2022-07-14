import java.util.Locale;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double grade1, grade2, finalGrade;
		
		System.out.print("Digite a primeira nota: ");
		grade1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		grade2 = sc.nextDouble();
		
		finalGrade = grade1 + grade2;
		
		System.out.println("Nota final: " + String.format("%.1f", finalGrade));
		
		if (finalGrade < 60) {
			System.out.println("REPROVADO");
		}

		sc.close();
	}

}
