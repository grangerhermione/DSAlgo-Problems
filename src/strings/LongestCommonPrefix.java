package strings;

import java.util.ArrayList;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix
 * of both S1 and S2.
 * 
 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * 
 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings
 * in the array.
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(ArrayList<String> A) {
		boolean flag = true;
		int index = 0;
		StringBuilder str = new StringBuilder();
		while (flag) {
			char first = A.get(0).charAt(index);
			int count = 1;
			for (int i = 1; i < A.size(); i++) {
				if (A.get(i).length() > index && A.get(i).charAt(index) == first) {
					count++;
				} else {
					flag = false;
					break;
				}
			}
			if (count == A.size()) {
				str.append(String.valueOf(first));
			}
			index++;
			if (index == A.get(0).length()) {
				break;
			}
		}
		return str.toString();
	}
}
