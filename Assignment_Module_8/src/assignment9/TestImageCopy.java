package assignment9;

import java.io.File;
import java.util.Scanner;
import static assignment9.ImageCopy.*;

public class TestImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter file path");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();

		File input = new File(path);

		if (copyImage(input)) {
			System.out.println("Image copied successfully");
		} else {
			System.out.println("Image copy unsuccessfull");
		}

		sc.close();

	}

}
