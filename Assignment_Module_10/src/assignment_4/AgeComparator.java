package assignment_4;

import java.util.Comparator;

public class AgeComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient patient1, Patient patient2) {
		return patient1.getAge() - patient2.getAge();
	}

}