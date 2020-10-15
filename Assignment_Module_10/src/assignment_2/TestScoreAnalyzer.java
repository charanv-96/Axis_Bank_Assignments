package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;
import static assignment_2.ScoreAnalyzer.*;
import assignment_2.*;

public class TestScoreAnalyzer {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub

		ScoreAnalyzer sa = new ScoreAnalyzer();

		System.out.println("Enter runs");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();

		String s[] = numbers.split(" ");

		int c = 0;

		for (String num1 : s) {

			int k = Integer.parseInt(num1);
			sa.addRunsToList(k);
			c++;

		}

		sa.displayRuns();

		System.out.println("Runrate : " + sa.calcRunRate());

		System.out.println("Lowest Runs : " + sa.lowestRunsScored());

		System.out.println("Count of player who batted : " + c);

	}

}
