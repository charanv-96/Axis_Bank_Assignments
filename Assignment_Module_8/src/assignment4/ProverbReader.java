package assignment4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedInputStream bin = new BufferedInputStream(
				new FileInputStream("D:\\eclipse-workspace\\Assignment_Module_8\\TopProverbs.txt"));
		int i;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
		bin.close();

	}

}
