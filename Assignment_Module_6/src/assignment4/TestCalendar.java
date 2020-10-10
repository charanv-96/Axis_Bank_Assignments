package assignment4;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();

		System.out.println("year : " + c.get(Calendar.YEAR));

		System.out.println("date : " + c.get(Calendar.DATE));

		c.add(Calendar.HOUR, 2);

		System.out.println("year : " + c.get(Calendar.HOUR));

		c.add(Calendar.MINUTE, -5);

		System.out.println("minute : " + c.get(Calendar.MINUTE));

		System.out.println("date : " + c.getTime());

	}

}
