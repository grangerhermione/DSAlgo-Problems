package twopointers;

import java.util.ArrayList;

/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 */
public class MergeTwoSortedLists {
  public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    int i = 0, j = 0;
    while (i < a.size() && j < b.size()) {
      if (a.get(i) < b.get(j)) {
        i++;
      } else {
        a.add(i, b.get(j));
        j++;
        i++;
      }
    }
    if (j < b.size()) {
      a.add(i, b.get(j));
      i++;
      j++;
    }
  }
}
