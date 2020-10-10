package assignment3_1;

public class SpaceRemover {

	public static String removeSpaces(String input) {

		String[] s = input.split("\\s+");

		String line = "";

		for (String l : s) {

			line += l + " ";

		}

		return line.strip();

	}

}
