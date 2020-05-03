package strings;

/*
 *You are given a string S, and you have to find all the amazing substrings of S.
 *Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */
public class AmazingSubarrays {
	public int solve(String A) {
		int count = 0;
		int n = A.length();
		A = A.toLowerCase();
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o'
					|| A.charAt(i) == 'u') {
				count += n - i;
			}
		}
		return count % 10003;
	}
}
