import java.util.Random;
import java.util.Scanner;
public class MagicBall {
	
	public static void main(String[] args) {
		System.out.print("Enter your question: ");
		Scanner sc = new Scanner(System.in);
		sc.next();
		sc.close();
		
		Random rand = new Random();
		int r = rand.nextInt(7);
		System.out.println(r);
		
		if(r == 0) {
			System.out.println ("As I see it, yes.");
		} 
		else if (r == 1) {
			System.out.println("Signs point to yes.");
		}
		else if(r == 2) {
			System.out.println("Reply hazy, try again.");
		}
		else if(r == 3) {
			System.out.println("Don't count on it.");
		}
		else if(r == 4) {
			System.out.println("Outlook not so good.");
		}
		else if(r == 5) {
			System.out.println("Yes");
		}
		else if(r == 6) {
			System.out.println("No");
		}
		
	}
}