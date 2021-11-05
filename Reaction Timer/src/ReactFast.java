import java.util.Scanner;

public class ReactFast {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Reaction time test");
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		System.out.println("GO!!!");
		long startTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		
		System.out.println("Your reaction time is " + reactionTime + "ms");
		
		
	}
}