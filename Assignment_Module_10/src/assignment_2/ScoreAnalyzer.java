package assignment_2;

import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer {

	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public ScoreAnalyzer() {

	}

	public LinkedList<Integer> getRunsData() {
		return runsData;
	}

	public void setRunsData(LinkedList<Integer> runsData) {
		this.runsData = runsData;
	}

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}

	public void addRunsToList(int runs) {

		this.runsData.add(runs);

	}

	public double calcRunRate() {

		double sum = 0;

		Iterator<Integer> it = this.runsData.iterator();

		while (it.hasNext()) {

			int i = it.next();

			sum += i;

		}

		double rr = sum / 50;

		return rr;

	}

	public int lowestRunsScored() {

		int lowestScore = this.runsData.getLast();

		Iterator<Integer> it = this.runsData.iterator();

		while (it.hasNext()) {

			int i = it.next();

			if (i < lowestScore) {
				lowestScore = i;
			}

		}

		return lowestScore;
	}

	public void displayRuns() {

		System.out.print("Runs Scored : ");

		int c = 1;

		for (int i : this.runsData) {
			System.out.print(c + "-" + i + " ");
		}
		System.out.println();

	}

}
