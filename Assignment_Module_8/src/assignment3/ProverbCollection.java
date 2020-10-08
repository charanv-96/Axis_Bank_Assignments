package assignment3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	public static void storeProverb(String proverb) throws IOException {

		FileOutputStream fout = new FileOutputStream("TopProverbs.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		byte b[] = proverb.getBytes();
		bout.write(b);

		bout.close();
		fout.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s = "";

		while (true) {

			System.out.println("Enter a proverb");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			if (input.equals("STOP")) {
				break;
			} else {
				s += input + "\n";

			}
			sc.close();
		}
		storeProverb(s);
	}

}
