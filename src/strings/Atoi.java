package strings;

/*
 *Implement atoi to convert a string to an integer.
 */
public class Atoi {
	public int atoi(final String A) {
		Integer res = 0;
		int n = A.length();
		int sign = 1;
		for (int i = 0; i < n; i++) {
			char ch = A.charAt(i);
			if (ch == '+') {
				continue;
			}
			if (ch == '-') {
				sign = -1;
				continue;
			}
			if (ch - '0' < 0 || ch - '0' > 9) {
				break;
			}
			res = res * 10 + (ch - '0');
		}
		return res * sign;
	}
}
