package assignment_5;

import java.util.LinkedHashSet;

import assignment_4.Patient;

public class TestPatientSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient p1 = new Patient(100, "Charan", 24);

		Patient p2 = new Patient(100, "Charan", 24);

		Patient p3 = new Patient(102, "Vallapaneni", 28);

		LinkedHashSet<Patient> patients = new LinkedHashSet<Patient>();

		patients.add(p1);
		patients.add(p2);
		patients.add(p3);

		System.out.println(patients.size());

		for (Patient p : patients) {
			System.out.println("Patient Id : " + p.getPatientId());
			System.out.println("Patient Name : " + p.getName());
			System.out.println("Patient Age : " + p.getAge());
		}

	}

}
