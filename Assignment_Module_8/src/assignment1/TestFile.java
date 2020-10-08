package assignment1;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("D:\\Badminton");
		file.mkdir();

		File file1 = new File(file, "singles.txt");
		file1.createNewFile();

		File file2 = new File(file, "dubbles.txt");
		file2.createNewFile();

		File file3 = new File("D:\\Badminton\\courts");
		file3.mkdir();

		File file4 = new File(file3, "smash.dat");
		file4.createNewFile();

		file2.renameTo(new File(file, "doubles.txt"));

		file1.delete();

	}

}
