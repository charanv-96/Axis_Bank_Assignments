package assignment3;

import java.util.Scanner;

public class TestAgeCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeCalculator1 ac1 = new AgeCalculator1();

		System.out.println("Enter Date of Birth");
		Scanner sc = new Scanner(System.in);
		String dateOfBirth = sc.next();

		try {
			System.out.println("Age : " + ac1.calculateAge(dateOfBirth));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
