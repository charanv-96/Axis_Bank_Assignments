package assignment3_1;

import static assignment3_1.SpaceRemover.*;

import java.util.Scanner;

public class TestSpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(removeSpaces(input));

		sc.close();

	}

}
