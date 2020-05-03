package twopointers;

import java.util.ArrayList;
import java.util.List;

/*
 * Find the intersection of two sorted arrays. OR in other words, Given 2 sorted arrays, find all
 * the elements which occur in both the arrays.
 */
public class IntersectionOfSortedArrays {
	public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < A.size() && j < B.size()) {
			if (A.get(i) < B.get(j)) {
				i++;
			} else if (A.get(i) > B.get(j)) {
				j++;
			} else {
				result.add(A.get(i));
				i++;
				j++;
			}

		}
		return result;
	}
}
