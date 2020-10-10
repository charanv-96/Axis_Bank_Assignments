package assignment_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatChanger {

	public static String changeFormat(String date) throws ParseException {

		Date d = new SimpleDateFormat("dd/mm/yyyy").parse(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

		System.out.println("Date Converted");

		return sdf.format(d);

	}

}
