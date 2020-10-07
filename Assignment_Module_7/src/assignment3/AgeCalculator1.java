package assignment3;

import java.util.Date;
import java.util.Formatter;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator1 {

	public int calculateAge(String dateOfBirth) throws Exception {

		try {

			Date dob = new SimpleDateFormat("dd/mm/yyyy").parse(dateOfBirth);

			Calendar c = Calendar.getInstance();

			c.setTime(dob);

			LocalDate birthDate = LocalDate.of(c.get(Calendar.YEAR), 1 + c.get(Calendar.MONTH), c.get(Calendar.DATE));

			LocalDate present = LocalDate.now();

			Period period = birthDate.until(present);

			return period.getYears();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Enter valid date format");
		}

	}

}


