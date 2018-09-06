package twopointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 */
public class ThreeSumZero {
  public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
    Collections.sort(A);
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    Set<String> set = new TreeSet<>();
    for (int i = 0; i < A.size() - 2; i++) {
      int j = i + 1;
      int k = A.size() - 1;
      while (j < k) {
        int sum = A.get(i) + A.get(j) + A.get(k);
        if (sum == 0) {
          String str = A.get(i) + ":" + A.get(j) + ":" + A.get(k);
          if (!set.contains(str)) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(A.get(i));
            temp.add(A.get(j));
            temp.add(A.get(k));
            result.add(temp);
            set.add(str);
          }
          j++;
          k--;
        } else if (sum > 0)
          k--;
        else
          j++;
      }
    }
    return result;
  }
}
