import java.util.Locale;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int password;
		
		System.out.print("Digite a senha: ");
		password = sc.nextInt();
		
		while (password != 2002) {
			System.out.print("Senha Invalida! Tente novamente: ");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");

		sc.close();
		
	}

}
