package bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array of N integers, find the pair of integers in the array which have minimum XOR
 * value. Report the minimum XOR value.
 */
public class MinXORValue {
	public int findMinXor(ArrayList<Integer> A) {
		Collections.sort(A);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.size() - 1; i++) {
			int xor = A.get(i) ^ A.get(i + 1);
			if (xor < min) {
				min = xor;
			}
		}
		return min;
	}
}
