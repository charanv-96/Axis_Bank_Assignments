package assignment8;

import java.io.File;

public class FileExplorer {
	
	public static void ListAll (String path) {

		File dir = new File(path);

		File[] files = dir.listFiles();

		if (files != null && files.length > 0) {

			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getAbsolutePath());
					ListAll(file.getAbsolutePath());

				} else {
					System.out.println("File name : " + file.getName());
				}
			}

		}

	}

}
