package strings;

/*
 *Given a string, determine if it is a palindrome, considering only alphanumeric characters 
 *and ignoring cases.
 */
public class PalindromeString {
	public int isPalindrome(String A) {
		int i = 0;
		int j = A.length() - 1;
		A = A.toLowerCase();
		boolean flag = true;
		while (i < j) {
			if (A.charAt(i) - 'a' < 0 || A.charAt(i) - 'a' > 26) {
				i++;
				continue;
			}
			if (A.charAt(j) - 'a' < 0 || A.charAt(j) - 'a' > 26) {
				j--;
				continue;
			}
			if (A.charAt(i) == A.charAt(j)) {
				i++;
				j--;
			} else {
				flag = false;
				break;
			}
		}
		return flag ? 1 : 0;

	}
}
