package assignment4;

import java.util.Scanner;

import assignment3.AgeCalculator1;

public class TestAgeCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeCalculator2 ac2 = new AgeCalculator2();

		System.out.println("Enter Date of Birth");
		Scanner sc = new Scanner(System.in);
		String dateOfBirth = sc.next();

		try {
			System.out.println("Age : " + ac2.calculateAge(dateOfBirth));
		} catch (InvalidDOBException ide) {
			System.out.println(ide.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
