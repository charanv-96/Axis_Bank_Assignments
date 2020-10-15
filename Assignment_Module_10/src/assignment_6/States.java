package assignment_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class States {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		LinkedHashSet<String> states = new LinkedHashSet<String>();

		BufferedReader br = new BufferedReader(new FileReader("States.txt"));

		String state = br.readLine();
		while (state != null) {
			states.add(state);
			state = br.readLine();
		}

		System.out.println("Total no of states : " + states.size());

		states.remove("Delhi");

		System.out.println("Total no of states : " + states.size());

		for (String s : states) {
			if (s.startsWith("K")) {
				System.out.println(s);
			} else {
				continue;
			}
		}

		TreeSet<String> newStates = new TreeSet<String>();
		newStates.addAll(states);

		for (String s : newStates) {
			System.out.println(s);
		}

	}

}
