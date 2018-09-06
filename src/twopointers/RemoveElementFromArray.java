package twopointers;

import java.util.ArrayList;

/*
 * Given an array and a value, remove all the instances of that value in the array. Also return the
 * number of elements left in the array after the operation. It does not matter what is left beyond
 * the expected length.
 */
public class RemoveElementFromArray {
  public int removeElement(ArrayList<Integer> a, int b) {
    int n = a.size();
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (a.get(i) != b) {
        a.set(j++, a.get(i));
      }
    }
    return j;
  }
}
