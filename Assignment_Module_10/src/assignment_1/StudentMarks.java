package assignment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of students");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Enter marks");
		Scanner sc1 = new Scanner(System.in);
		String numbers = sc1.nextLine();

		String s[] = numbers.split(" ");

		ArrayList<Integer> marks = new ArrayList<Integer>();

		for (String num1 : s) {

			marks.add(Integer.parseInt(num1));

		}

		Iterator<Integer> it = marks.iterator();

		int highestMark = 0;

		float sum = 0;

		while (it.hasNext()) {

			int i = it.next();

			if (i > highestMark) {
				highestMark = i;
			}

			sum += i;

		}

		float avg = sum / num;

		System.out.println("Highest Marks : " + highestMark);

		System.out.println("Average Marks : " + avg);

		Collections.sort(marks);

		System.out.println("3rd student mark : " + marks.get(2));

		System.out.print("Sorted : ");

		int c = 1;

		Iterator<Integer> it1 = marks.iterator();

		while (it1.hasNext()) {

			int i = it1.next();

			System.out.print(c + "-" + i + " ");

		}

		sc.close();

		sc1.close();

	}

}
