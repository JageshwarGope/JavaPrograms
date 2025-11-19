package RahulSetty25Questions;

public class PrintLetters {

	public static void lettersPrint(String s) { // using ascii

		for (int i = 0; i <= s.length() - 1; i++) {
			int charToInt = s.charAt(i);
			if (charToInt >= 48 && charToInt <= 57) {
				charToInt = charToInt - 48;
				for (int j = 0; j < charToInt; j++) {
					System.out.print(s.charAt(i - 1));
				}

			}
		}

	}

	static void convertNumToChar(String s) { // using predefined methods

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				int a = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < a; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}
	}

	public static void main(String[] args) {

		String s = "a2b3c4";

		lettersPrint(s);

	}

}
