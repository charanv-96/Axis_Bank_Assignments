package assignment_2;

public class Capitalizer {

	public static String capitalize(String input) {

		String[] s = input.split(" ");

		String line = "";

		for (String l : s) {
			String word = "";
			if (l.length() > 1) {
				word = l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase();
			} else {
				word = l.toUpperCase();
			}
			line += word + " ";

		}

		return line;

	}

}
