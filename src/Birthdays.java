package src;
// Jasmine Chi
// This program calculates the absolute day that birthday with a certain day and month
// would fall on, calculates when the next birthday is in and calculates which
// birthday is sooner and then prints a fun fact

import java.util.Scanner;

public class Birthdays {
	public static void main(String[] args) {

		program();
	}

	public static void program() {
		//Asks user for today's date and stores the dates as integers
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter today’s date (month day): ");

		int todayMonth = input.nextInt();
		int todayDay = input.nextInt();
		//Uses method calculateAbsoluteDay to find the absolute day of the year out of 365(not leap year)
		int todayAbsolute = calculateAbsoluteDay(todayMonth, todayDay);
		
		
		System.out.println(
				"Today is " + todayMonth + "/" + todayDay + "/2020," + " day #" + todayAbsolute + " of the year.");
		
		//Uses methods respectively to find the the persons birthday, and days until birthday
		int daysFirstPerson = personOne(todayMonth, todayDay);
		int daysSecondPerson = personTwo(todayMonth, todayDay);
		System.out.println();
		
		//prints which day is sooner 
		whichdayIsSooner(daysFirstPerson, daysSecondPerson);

		System.out.println();
		
		System.out.println("Did you know October 17th is National Pasta Day? Noodles for the win!");
	}

	// Method that calculates the birthday information of person one.
	public static int personOne(int todayMonth, int todayDay) {
		Scanner input = new Scanner(System.in);
		System.out.println("");
		//Asks user for person 1's birthday and stores the dates as integers
		System.out.println("Please enter person #1's birthday (month day): ");

		int month = input.nextInt();
		int day = input.nextInt();

		int todayAbsolute = calculateAbsoluteDay(month, day);
		
		System.out.print(month + "/" + day + "/" + "2020 falls on day #" + todayAbsolute + " of 365. ");

		int daysUntilNextday = nextBirthday(todayMonth, todayDay, month, day);

		if (daysUntilNextday == 0) {

			System.out.println("Happy birthday! :)");
		} else {

			System.out.println("Your next birthday is in " + daysUntilNextday + " day(s).");

		}

		return daysUntilNextday;
	}
	// Method that calculates the birthday information of person two.
	public static int personTwo(int todayMonth, int todayDay) {
		Scanner input = new Scanner(System.in);
		System.out.println("");
		//Asks user for person 2's birthday and stores the dates as integers
		System.out.println("Please enter person #2's birthday (month day): ");

		int month = input.nextInt();
		int day = input.nextInt();

		int todayAbsolute = calculateAbsoluteDay(month, day);

		System.out.print(month + "/" + day + "/" + "2020 falls on day #" + todayAbsolute + " of 365. ");

		int daysUntilNextday = nextBirthday(todayMonth, todayDay, month, day);

		if (daysUntilNextday == 0) {

			System.out.println("Happy birthday! :)");
		} else {
			System.out.println("Your next birthday is in " + daysUntilNextday + " day(s).");
		}

		return daysUntilNextday;
	}
	//Finds days until the next birthday
	public static int nextBirthday(int todayMonth, int todayDay, int month, int day) {
		int numberOfDays = 0;
		int daysInYear = 365;

		if (todayMonth > month) {
			numberOfDays = (daysInYear - calculateAbsoluteDay(todayMonth, todayDay)) + calculateAbsoluteDay(month, day);
		} else {
			numberOfDays = (calculateAbsoluteDay(month, day) - calculateAbsoluteDay(todayMonth, todayDay));

		}
		return numberOfDays;
	}

// Method that calculates which person's day is sooner

	public static void whichdayIsSooner(int daysFirstPerson, int daysSecondPerson) {

		if (daysFirstPerson < daysSecondPerson) {

			System.out.println("Person #1's birthday is sooner.");
		}

		else if (daysSecondPerson < daysFirstPerson) {

			System.out.println("Person #2's birthday is sooner.");
		}

		else {

			System.out.println("Person #1 and Person #2 have the same birthday.");
		}

	}

// Method that calculates the absolute day of given month and day
	public static int calculateAbsoluteDay(int month, int day) {
		int absoluteDay = 0;

		
		for (int i = 1; i <= month - 1; i++) {
			//If month is febuary adds 28 to absolute day
			if (i == 2) {
				absoluteDay += 28;
				
			//If month is april, june, september, 
			} else if (i == 4 | i == 6 | i == 9 | i == 11) {

				absoluteDay += 30;
			} else {

				absoluteDay += 31;
			}
		}
		absoluteDay += day;

		return absoluteDay;
	}
}
