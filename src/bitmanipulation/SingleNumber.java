package bitmanipulation;

import java.util.List;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
  public int singleNumber(final List<Integer> A) {
    int xor = A.get(0);
    for (int i = 1; i < A.size(); i++) {
      xor = A.get(i) ^ xor;
    }
    return xor;
  }
}
