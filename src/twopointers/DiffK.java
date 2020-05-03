package twopointers;

import java.util.ArrayList;

/*
 * Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2
 * indices i and j such that A[i] - A[j] = k, i != j.
 */
public class DiffK {
	public int diffPossible(ArrayList<Integer> A, int B) {
		int i = 0, j = 1;
		while (i < A.size() && j < A.size()) {
			if (i != j && A.get(j) - A.get(i) == B) {
				return 1;
			} else if (A.get(j) - A.get(i) < B) {
				j++;
			} else
				i++;
		}
		return 0;
	}
}
