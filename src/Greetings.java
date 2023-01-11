package src;

// Jasmine Chi

import java.util.*;

public class Greetings {

	public static void main(String[] args) {
		int curyear = (Calendar.getInstance().get(Calendar.YEAR)); // Gets the current year
		Scanner scanner = new Scanner(System.in);
		
		// Takes first letter of first name
		System.out.println("Please enter your first name:");
		String name = scanner.next();
		name = name.substring(0, 1);
		
		// Takes last name
		System.out.println("Please enter your last name:");
		String lName = scanner.next();

		// Subtracts age by current year
		System.out.println("Please enter your year of birth:");
		int age = scanner.nextInt();
		curyear -= age; 
		
		System.out.println("Greetings, " + name + ". " + lName + "! You are about " + curyear + " years old.");
		scanner.close();
	}
}
