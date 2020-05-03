package arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Find out the maximum sub-array of non negative numbers from an array. The sub-array should be
 * continuous. That is, a sub-array created by choosing the second and fourth element and skipping
 * the third element is invalid.
 * 
 * Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is
 * greater than sub-array B if sum(A) > sum(B).
 * 
 * 
 */
public class MaxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
		long maxSum = 0;
		int maxSegment = 0;
		long globalMaxSum = Long.MIN_VALUE;
		long globalMaxSegment = Long.MIN_VALUE;
		ArrayList<Integer> output = new ArrayList<>();
		ArrayList<Integer> globalOutput = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		// boolean flag=true;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) >= 0) {
				maxSum += A.get(i);
				maxSegment++;
				output.add(A.get(i));
				globalOutput.add(-1);
			} else {
				// flag=false;
				if (maxSum > globalMaxSum) {
					globalMaxSum = maxSum;
					globalMaxSegment = maxSegment;
					Collections.copy(globalOutput, output);
				} else if (maxSum == globalMaxSum) {
					if (maxSegment > globalMaxSegment) {
						Collections.copy(globalOutput, output);
					}
				}
				maxSum = 0;
				maxSegment = 0;
				// Collections.copy(globalOutput, output);
				output.clear();
			}
		}
		if (maxSum > globalMaxSum) {
			globalMaxSum = maxSum;
			globalMaxSegment = maxSegment;
			Collections.copy(globalOutput, output);
		} else if (maxSum == globalMaxSum) {
			if (maxSegment > globalMaxSegment) {
				Collections.copy(globalOutput, output);
			}
		}
		for (int i = 0; i < globalMaxSegment; i++) {
			// if(globalOutput.get(i)!=(-1)){
			result.add(globalOutput.get(i));
			// }
			// else
			// break;
		}
		return result;
	}
}
