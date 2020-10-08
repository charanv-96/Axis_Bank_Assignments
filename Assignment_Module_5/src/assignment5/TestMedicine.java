package assignment5;

import java.util.Date;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medicine meds[] = new Medicine[5];

		int num = (1 + (int) (Math.random() * 3));
		System.out.println(num);

		switch (num) {

		case 1: {
			Tablet t = new Tablet(123, "29/09/2020");
			System.out.println(t.getDetails());
			System.out.println(t.displayLabel());
			break;
		}
		case 2: {
			Syrup s = new Syrup(333, "29/07/2020");
			System.out.println(s.getDetails());
			System.out.println(s.displayLabel());
			break;
		}
		case 3: {
			Ointment o = new Ointment(343, "09/07/2020");
			System.out.println(o.getDetails());
			System.out.println(o.displayLabel());

			break;
		}

		}

	}

}
