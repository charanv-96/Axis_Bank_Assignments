package assignment_7;

import java.util.Scanner;

import static assignment_7.Verifier.*;

public class TestVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the password");

		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();

		if (verifyPassword(password)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		sc.close();

	}

}
