import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class WPMProgram {
	
	static String [] words = {"envelope", "cantelope", "the", "hello", "microphone", "elephant", "biscuit", "hammer", "went", "cap", "hi", "charlie", "vpn",
							  "scanner", "object", "alex", "class", "methods"};

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Simulated TypeRacer");
		Thread.sleep(2000);
		System.out.println(3);
		Thread.sleep(1000);
		System.out.println(2);
		Thread.sleep(1000);
		System.out.println(1);
		Thread.sleep(1000);
		
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(words[rand.nextInt(9)] + " ");
		}
		System.out.println();
		System.out.println("Start Typing: ");
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typeWords = scan.nextLine();
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typeWords.length();
		// (x characters / 5) / 1min = y WPM
		int wpm = (int)((((double) numChars / 5) / seconds) * 60);
		System.out.println("Your wpm is " + wpm + "!");
		scan.close();
	}

}
