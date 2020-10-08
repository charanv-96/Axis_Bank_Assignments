package assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("document.txt"));

		FileWriter fw = new FileWriter(new File("FormattedDocument.txt"), true);

		String line;

		while ((line = br.readLine()) != null) {

			String[] s = line.split("\\s+");

			String newLine = "";

			for (String s1 : s) {
				newLine += s1 + " ";
			}
			newLine += "\n";

			fw.write(newLine);

		}
		
		br.close();
		fw.close();

	}

}
