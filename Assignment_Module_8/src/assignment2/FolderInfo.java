package assignment2;

import java.io.File;

public class FolderInfo {

	public static void printDirectory(String path) {

		File dir = new File(path);

		File[] files = dir.listFiles();

		if (files != null && files.length > 0) {

			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("Directory : " + file.getName());
					System.out.println("Folder path : " + file.getAbsolutePath().substring(0,
							file.getAbsolutePath().length() - file.getName().length()));

				} else {
					System.out.println("File name : " + file.getName());
					System.out.println("Absolute File path : " + file.getAbsolutePath());
					System.out.println("Folder path : " + file.getAbsolutePath().substring(0,
							file.getAbsolutePath().length() - file.getName().length()));
				}
			}

		}

	}

}
