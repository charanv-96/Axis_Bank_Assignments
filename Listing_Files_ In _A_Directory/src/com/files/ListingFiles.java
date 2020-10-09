package com.files;

import java.io.File;

public class ListingFiles {

	public static void ListFiles(String path) {

		File dir = new File(path);

		File[] files = dir.listFiles();

		if (files != null && files.length > 0) {

			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getAbsolutePath());
					ListFiles(file.getAbsolutePath());

				} else {
					System.out.println("File name : " + file.getName());
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListFiles("D:\\Axis_Training");

	}

}
