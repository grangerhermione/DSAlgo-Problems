package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Given a list of non negative integers, arrange them such that they form the largest number.
 */
public class LargestNumber {
  public String largestNumber(final List<Integer> A) {
    Collections.sort(A, new Comparator<Integer>() {
      public int compare(Integer a, Integer b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        return (strB + strA).compareTo(strA + strB);
      }
    });
    StringBuilder str = new StringBuilder();
    for (Integer a : A) {
      str.append(String.valueOf(a));
    }
    while (str.charAt(0) == '0' && str.length() > 1)
      str.deleteCharAt(0);
    return str.toString();
  }
}
