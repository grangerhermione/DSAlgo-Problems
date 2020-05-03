package strings;
/*
 *Validate if a given string is numeric.
 */

public class ValidNumber {
	public int isNumber(final String A) {

		int n = A.length();
		if (n == 0) {
			return 0;
		}
		if (n == 1 && !Character.isDigit(A.charAt(0))) {
			return 0;
		}
		if (A.charAt(0) != '+' && A.charAt(0) != '-' && A.charAt(0) != '.' && !Character.isDigit(A.charAt(0))) {
			return 0;
		}
		boolean flagDotOrE = false;
		for (int i = 1; i < n; i++) {
			// If any of the char does not belong to
			// {digit, +, -, ., e}
			if (!Character.isDigit(A.charAt(i)) && A.charAt(i) != 'e' && A.charAt(i) != '.' && A.charAt(i) != '+'
					&& A.charAt(i) != '-')
				return 0;

			if (A.charAt(i) == '.') {
				// checks if the char 'e' has already
				// occurred before '.' If yes, return 0.
				if (flagDotOrE == true)
					return 0;

				// If '.' is the last character.
				if (i + 1 >= n)
					return 0;

				// if '.' is not followed by a digit.
				if (!Character.isDigit(A.charAt(i + 1)))
					return 0;
			}

			else if (A.charAt(i) == 'e') {
				// set flagDotOrE = 1 when e is encountered.
				flagDotOrE = true;

				// if there is no digit before 'e'.
				if (!Character.isDigit(A.charAt(i - 1)))
					return 0;

				// If 'e' is the last Character
				if (i + 1 >= n)
					return 0;

				// if e is not followed either by
				// '+', '-' or a digit
				if (!Character.isDigit(A.charAt(i + 1)) && A.charAt(i + 1) != '+' && A.charAt(i + 1) != '-')
					return 0;
			}
		}

		/*
		 * If the string skips all above cases, then it is numeric
		 */
		return 1;
	}
}
