package src;
// Jasmine Chi
// Making a cute little garden

public class AsciiArt {

	// sets constant for asciiart
	public static int SCALE = 5;

	// creates asciiart
	public static void main(String[] args) {
		asciiArt();
	}
	
	// puts plants and fences together
	public static void asciiArt() {
		
		for (int i = 1; i <= SCALE; i++) {
			for(int j = 1; j < SCALE; j++) {
				fence();
				plants();
			}
			fence();
			System.out.println("");
			
			}
		
		text();
	}
	// creates the garden
	public static void garden() {
		fence();
		plants();
	}
	// creates sides or fences of the garden
	public static void fence() {

		System.out.print("|| ");
	}

	// creates flowers or the plants of garden
	public static void plants() {

		System.out.print("\\|/ ");

	}
	
	// prints text for a brief description
	public static void text() {
		System.out.println("this is a garden!");
	}
}
