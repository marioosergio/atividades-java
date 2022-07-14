import java.util.Locale;
import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int initialTime, finalTime, gameTime;
		
		System.out.print("Hora inicial: ");
		initialTime = sc.nextInt();
		
		System.out.print("Hora final: ");
		finalTime = sc.nextInt();
		
		if (finalTime > initialTime) {
			gameTime = finalTime - initialTime;
		}
		else {
			gameTime = 24 - initialTime + finalTime;
		}
		
		System.out.println("O jogo durou " + gameTime + " hora(s)");
		
		sc.close();
		
	}

}
