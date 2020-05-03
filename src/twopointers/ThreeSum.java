package twopointers;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given
 * number, target. Return the sum of the three integers.
 */
public class ThreeSum {
	public int threeSumClosest(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		int target = 0;
		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < A.size() - 2; i++) {
			int j = i + 1;
			int k = A.size() - 1;
			while (j < k) {
				int sum = A.get(i) + A.get(j) + A.get(k);
				int x = sum - B;
				if (Math.abs(x) < minDiff) {
					minDiff = Math.abs(x);
					target = sum;
				}
				if (sum > B)
					k--;
				else
					j++;
			}
		}
		return target;
	}
}
