package assignment_5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");

		System.out.println(sdf1.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:MM:SS");

		System.out.println(sdf2.format(date));

	}

}
