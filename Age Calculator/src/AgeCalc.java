import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {

	public static void main(String[] args) {
		
		System.out.print("What is your name? ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2002, 8, 24);
		
		int years = Period.between(birthDate, today).getYears();
		int months = Period.between(birthDate, today).getMonths();
		int days = Period.between(birthDate, today).getDays();
		
		System.out.println(name + " is " + years + " years " + months + " months and " + days + " days old.");
	}

}
