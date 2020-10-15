package assignment_4;

import java.util.Comparator;

public class NameComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient patient1, Patient patient2) {
		return patient1.getName().compareTo(patient2.getName());
	}

}