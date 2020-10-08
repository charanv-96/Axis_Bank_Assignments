package assignment9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static Boolean copyImage(File file) {

		boolean flag = true;

		try {

			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));

			if (file.getName().split("\\.")[1].equals("jpg")) {

				FileOutputStream fout = new FileOutputStream(file.getName().split("\\.")[0] + "_copy.jpeg");
				BufferedOutputStream bout = new BufferedOutputStream(fout);

				byte b[] = bin.readAllBytes();
				bout.write(b);

				bin.close();

				bout.close();
				fout.close();

				flag = true;
			} else {
				System.out.println("File format not supported");
				bin.close();
				flag = false;
			}

		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return flag;

	}

}
