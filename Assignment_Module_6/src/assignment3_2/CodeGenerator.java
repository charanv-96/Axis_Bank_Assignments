package assignment3_2;

public class CodeGenerator {

	public static StringBuilder generateCode(String input) {

		StringBuilder sb = new StringBuilder(input);

		sb.reverse();

		sb.delete(0, 1);

		sb.replace(0, 2, "*");

		sb.replace(sb.length() - 1, sb.length(), "#");

		return sb;

	}

}
