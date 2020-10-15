package assignment_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestPatient {

	public static int getPatientAge(String name, TreeSet<Patient> patients) {

		int age = -1;

		for (Patient p : patients) {
			if (p.getName().equals(name)) {
				age = p.getAge();
			}
		}

		return age;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Patient> patients = new ArrayList<Patient>();

		Patient p1 = new Patient(100, "Charan", 24);

		Patient p2 = new Patient(101, "Charon", 21);

		Patient p3 = new Patient(102, "Vallapaneni", 28);

		patients.add(p1);
		patients.add(p2);
		patients.add(p3);

		TreeSet<Patient> patientSet = new TreeSet<Patient>();

		patientSet.add(p1);
		patientSet.add(p2);
		patientSet.add(p3);

		for (Patient p : patientSet) {
			System.out.println("Patient Id : " + p.getPatientId());
			System.out.println("Patient Name : " + p.getName());
			System.out.println("Patient Age : " + p.getAge());
		}

		Collections.sort(patients, new NameComparator());

		for (Patient p : patients) {
			System.out.println("Patient Id : " + p.getPatientId());
			System.out.println("Patient Name : " + p.getName());
			System.out.println("Patient Age : " + p.getAge());
		}

		Collections.sort(patients, new AgeComparator());

		Iterator<Patient> it = patients.iterator();

		while (it.hasNext()) {

			Patient p = it.next();

			System.out.println("Patient Id : " + p.getPatientId());
			System.out.println("Patient Name : " + p.getName());
			System.out.println("Patient Age : " + p.getAge());

		}

		int age = getPatientAge("Charan", patientSet);

		if (age != -1) {
			System.out.println("Age : " + age);
		} else {
			System.out.println("Name not in set");
		}

	}

}
