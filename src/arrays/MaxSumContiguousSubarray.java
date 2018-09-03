package arrays;
import java.util.List;

/*
 * Find the contiguous subarray within an array (containing at least one number) which has the
 * largest sum.
 */
public class MaxSumContiguousSubarray {
  public int maxSubArray(final List<Integer> A) {
    int maxSoFar = Integer.MIN_VALUE;
    int max = 0;
    for (int i = 0; i < A.size(); i++) {
      max = max + A.get(i);
      if (maxSoFar < max)
        maxSoFar = max;
      if (max < 0)
        max = 0;
    }
    return maxSoFar;
  }
}
