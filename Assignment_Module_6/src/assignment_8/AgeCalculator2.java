package assignment_8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator2 {

	public String calculateAge(String dateOfBirth) throws Exception {

		try {

			Date dob = new SimpleDateFormat("dd/mm/yyyy").parse(dateOfBirth);

			Calendar c = Calendar.getInstance();

			c.setTime(dob);

			LocalDate birthDate = LocalDate.of(c.get(Calendar.YEAR), 1 + c.get(Calendar.MONTH), c.get(Calendar.DATE));

			LocalDate present = LocalDate.now();

			Period period = birthDate.until(present);

			System.out.println(birthDate);

			System.out.println(present);

			if (period.getYears() < 0) {
				throw new InvalidDOBException();
			}

			return period.getYears() + " year(s) " + period.getMonths() + " month(s)";

		} catch (InvalidDOBException ide) {
			throw new InvalidDOBException();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Enter valid date format");
		}

	}

}
