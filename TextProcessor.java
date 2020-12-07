// Jasmine Chi, AP CS Peterson
// Text Processing Activity

public class TextProcessor {

	public static void main(String[] args) {
		// trying a few implementations

		System.out.println(isLowerCase('j'));
		System.out.println(isLowerCase('A'));
		System.out.println(isLowerCase('.'));

		System.out.println(toUpperCase('j'));
		System.out.println(toUpperCase('A'));
		System.out.println(toUpperCase('?'));

		System.out.println(toUpperCase("Bellevue WA"));
		System.out.println(toUpperCase("BELLEVUE wa"));

		System.out.println(compareToIgnoreCase("wheres", "myphone"));
		System.out.println(compareToIgnoreCase("WHERES", "MYPHONE"));
		System.out.println(compareToIgnoreCase("SeaTTLE", "SEATTle"));
		System.out.println(compareToIgnoreCase("RhodeIsland", "Providence"));
		System.out.println(compareToIgnoreCase("4", "4"));
		
	}

	public static boolean isLowerCase(char c) {
		return c >= 'a' && c <= 'z';

	}

	public static char toUpperCase(char c) {
		if (isLowerCase(c)) {
			return (char) (c - 'j' + 'J');
		} else {
			return c;
		}

	}

	public static String toUpperCase(String s) {
		return (s.toUpperCase());
	}

	public static int compareToIgnoreCase(String s, String t) {

		if (s.length() < t.length()) {
			return -1;
		} 
		else if (s.length() > t.length()) {
			return 1;
		}
		
		else {
			return 0;
		}
	}
}
