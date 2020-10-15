package assignment_3;

import java.util.Scanner;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Runs Scored");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();

		String s[] = numbers.split(" ");

		TreeMap<String, Integer> playerScores = new TreeMap<String, Integer>();

		for (String ps : s) {

			playerScores.put(ps.split("-")[0], Integer.parseInt(ps.split("-")[1]));

		}

		System.out.println("Players who batted");

		for (String i : playerScores.keySet()) {

			System.out.println(i);

		}

		System.out.println("Scores by Players");

		for (String i : playerScores.keySet()) {

			System.out.println(i + " : " + playerScores.get(i));

		}

		int sum = 0;

		for (int i : playerScores.values()) {

			System.out.println(i);

			sum += i;

		}

		int highestScore = 0;

		String player = null;

		for (String i : playerScores.keySet()) {

			if (playerScores.get(i) > highestScore) {
				player = i;
				highestScore = playerScores.get(i);

			}

		}

		System.out.println("Name of highest scorer : " + player);

		System.out.println("Runs scored by Dhoni : " + playerScores.get("Dhoni"));
		System.out.println("Total Score : " + sum);

	}

}
