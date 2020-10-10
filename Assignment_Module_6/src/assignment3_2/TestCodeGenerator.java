package assignment3_2;

import static assignment3_2.CodeGenerator.*;

import java.util.Scanner;

public class TestCodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(generateCode(input).toString().toUpperCase());

		sc.close();

	}

}
