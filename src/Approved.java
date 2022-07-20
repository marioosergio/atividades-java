import java.util.Locale;
import java.util.Scanner;

public class Approved {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double gradeAverage;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			name[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (i = 0; i < n; i++) {
			gradeAverage = grade1[i] + grade2[i];
			
			if (gradeAverage / 2 >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
