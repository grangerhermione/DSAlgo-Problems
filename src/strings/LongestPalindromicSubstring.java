package strings;

/*
 * Given a string S, find the longest palindromic substring in S.
 * 
 * Substring of string S:
 * 
 * S[i...j] where 0 <= i <= j < len(S) Incase of conflict, return the substring which occurs first (
 * with the least starting index ).
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String A) {
		int n = A.length();
		boolean table[][] = new boolean[n][n];
		int maxlength = 1;
		for (int i = 0; i < n; i++) {
			table[i][i] = true;
		}
		int start = 0;
		for (int i = 0; i < n - 1; i++) {
			if (A.charAt(i) == A.charAt(i + 1)) {
				table[i][i + 1] = true;
				maxlength = 2;
				start = i;
			}
		}

		for (int k = 3; k <= n; k++) {
			for (int i = 0; i < n - k + 1; i++) {
				int j = i + k - 1;
				if (table[i + 1][j - 1] && A.charAt(i) == A.charAt(j)) {
					table[i][j] = true;
					if (k > maxlength) {
						maxlength = k;
						start = i;
					}
				}
			}
		}

		return A.substring(start, start + maxlength - 1);
	}
}
