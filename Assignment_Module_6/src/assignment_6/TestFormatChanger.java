package assignment_6;

import java.text.ParseException;
import java.util.Scanner;

import static assignment_6.FormatChanger.*;

public class TestFormatChanger {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		System.out.println("Enter Date in dd/mm/yyyy format");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(changeFormat(input));

		sc.close();

	}

}
