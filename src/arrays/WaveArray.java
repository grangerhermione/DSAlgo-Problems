package arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array of integers, sort the array into a wave like array and return it, In other words,
 * arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 */
public class WaveArray {
  public ArrayList<Integer> wave(ArrayList<Integer> A) {
    Collections.sort(A);
    for (int i = 1; i < A.size(); i += 2) {
      Integer temp = A.get(i - 1);
      A.add(i - 1, A.get(i));
      A.add(i, temp);
    }
    return A;
  }
}
