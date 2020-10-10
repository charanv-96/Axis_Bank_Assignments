package assignment_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verifier {

	public static boolean verifyPassword(String password) {

		if (password.length() >= 6) {

			Pattern pattern = Pattern.compile("^[a-z]", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(password);
			boolean matchFound = matcher.find();
			if (matchFound) {
				Pattern pattern1 = Pattern.compile(".*[@,#,!]+.*");
				Matcher matcher1 = pattern1.matcher(password);
				boolean matchFound1 = matcher1.find();
				if (matchFound1) {
					Pattern pattern2 = Pattern.compile(".*[1-9]+.*");
					Matcher matcher2 = pattern2.matcher(password);
					boolean matchFound2 = matcher2.find();
					if (matchFound2) {
						return true;
					} else {
						return false;
					}

				} else {
					return false;
				}
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

}
