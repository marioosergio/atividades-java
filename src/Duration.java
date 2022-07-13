import java.util.Locale;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duration, seconds, minutes, hours, remainder;
		
		System.out.print("Digite a duração em segundos: ");
		duration = sc.nextInt();

		hours = duration / 3600;
		remainder = duration % 3600;
		minutes = remainder / 60;
		seconds = remainder % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		sc.close();
		
	}

}