package assignment5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ProverbReveser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedInputStream bin = new BufferedInputStream(
				new FileInputStream("D:\\eclipse-workspace\\Assignment_Module_8\\TopProverbs.txt"));

		int i;

		String s = "";
		String finalString = "";

		while ((i = bin.read()) != -1) {

			String char1 = String.valueOf((char) i);

			if (char1.equals(" ") || char1.equals("\n")) {
				finalString += reverse(s);
				finalString += char1;
				s = "";
			} else {
				s += char1;
			}

		}
		System.out.println(finalString);
		bin.close();

	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		String reverseString = "";

		for (int i = s.length(); i > 0; i--) {
			reverseString += s.substring(i - 1, i);
		}

		return reverseString;
	}

}
