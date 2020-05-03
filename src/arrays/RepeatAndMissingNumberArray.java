package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given a read only array of n integers from 1 to n.
 * 
 * Each integer appears exactly once except A which appears twice and B which is missing.
 * 
 * Return A and B.
 */
public class RepeatAndMissingNumberArray {
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		ArrayList<Integer> output = new ArrayList<>(2);
		Integer arr[] = new Integer[A.size()];
		for (int i = 0; i < A.size(); i++) {
			arr[i] = A.get(i);
		}
		for (int i = 0; i < A.size(); i++) {
			if (arr[Math.abs(arr[i]) - 1] > 0) {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			} else {
				output.add(Math.abs(arr[i]));
			}
		}
		for (int i = 0; i < A.size(); i++) {
			if (arr[i] > 0) {
				output.add(i + 1);
			}
		}
		return output;
	}
}
