import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String word = sc.nextLine();
		word = word.replace(" ", "");
		String reverse = "";
		boolean palindrome = true;
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
			System.out.println(reverse);

		}
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if (palindrome) {
			System.out.println("The word " + word + " is a palindrome!!");
		} else {
			System.out.println("The " + word + " is not a palindrome!!");
		}


	}

}
