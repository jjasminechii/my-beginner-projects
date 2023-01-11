package src;
// Jasmine Chi
// This program creates a scaleable Space Needle!

public class SpaceNeedle {

	// sets constant for Space Needle class
	public static int SCALE = 4;

	// creates space needle
	public static void main(String[] args) {
		spaceNeedle();
	}

	// stores all methods into a single method
	// to print space needle
	public static void spaceNeedle() {
		needle();
		disc();
		middle();
		base();
	}

		// creates base of needle
		public static void base() {
			for (int i = 1; i <= SCALE; i++) {
				for (int blankspace = 1; blankspace <=SCALE * 3 - 3 * i; blankspace++) {
					System.out.print(" ");

				}
				for (int j = 1; j <= 1; j++) {
					System.out.print("__/");

				}
				for (int k = 1; k <= i-1; k++) {
					System.out.print(":::");

				}
				System.out.print("||");
				for (int k = 1; k <= i-1; k++) {
					System.out.print(":::");

				}
				for (int j = 1; j <= 1; j++) {
					System.out.print("\\__");
				}

				System.out.println();
			}

			System.out.print("|");
			for (int i = 1; i <= SCALE * 6; i++) {
				System.out.print("\"");

			}

			System.out.println("|");

		}

	// creates middle part of space needle
	public static void middle() {
		//calls needle to make top part of the middle body
		needle();

		for (int i = 1; i <= SCALE * 4; i++) {

			for (int j = 1; j <= 3 * SCALE - 3; j++) {

				System.out.print(" ");
			}

			System.out.println("|%%||%%|");

		}
	}
	
		// creates disc
		public static void disc() {
			for (int i = 1; i <= SCALE; i++) {
				for (int blankspace = 1; blankspace <= SCALE - i; blankspace++) {
					System.out.print("   ");

				}
				for (int j = 1; j <= 1; j++) {
					System.out.print("__/");

				}
				for (int k = 1; k <= i - 1; k++) {
					System.out.print(":::");

				}
				System.out.print("||");
				for (int k = 1; k <= i - 1; k++) {
					System.out.print(":::");

				}
				for (int j = 1; j <= 1; j++) {
					System.out.print("\\__");
				}

				System.out.println();
			}

			System.out.print("|");

			for (int i = 1; i <= SCALE * 6; i++) {
				System.out.print("\"");

			}
			System.out.println("|");

			for (int i = 1; i <= SCALE; i++) {

				for (int j = 1; j <= i-1; j++) {

					System.out.print("  ");
				}

				System.out.print("\\_");

				for (int k = SCALE * 3 - i; k >= i; k--) {
					System.out.print("/\\");
				}

				System.out.println("_/");
			}
		}

	//creates needle
	public static void needle() {
		for (int needle = 1; needle <= SCALE; needle++) {

			for (int blankspace = 1; blankspace <= SCALE * 3; blankspace++) {

				System.out.print(" ");
			}

			System.out.println("||");
		}
	}
}