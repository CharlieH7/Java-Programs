import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int result = rnd.nextInt(6) + 1;
		System.out.println("You rolled a: " + result);

	}

}
