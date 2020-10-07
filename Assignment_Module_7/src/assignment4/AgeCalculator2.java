package assignment4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator2 {

	public int calculateAge(String dateOfBirth) throws Exception {

		try {

			Date dob = new SimpleDateFormat("dd/mm/yyyy").parse(dateOfBirth);

			Calendar c = Calendar.getInstance();

			c.setTime(dob);

			LocalDate birthDate = LocalDate.of(c.get(Calendar.YEAR), 1 + c.get(Calendar.MONTH), c.get(Calendar.DATE));

			LocalDate present = LocalDate.now();

			Period period = birthDate.until(present);

			if (period.getYears() < 0) {
				throw new InvalidDOBException();
			}

			return period.getYears();

		} catch (InvalidDOBException ide) {
			throw new InvalidDOBException();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Enter valid date format");
		}

	}

}
