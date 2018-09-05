package binarysearch;

import java.util.List;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).
 * 
 * You are given a target value to search. If found in the array, return its index, otherwise return
 * -1.
 * 
 * You may assume no duplicate exists in the array.
 */
public class RotatedSortedArraySearch {
  public int search(final List<Integer> a, int b) {
    return bSearch(a, 0, a.size() - 1, b);
  }

  private int bSearch(List<Integer> a, int low, int high, int b) {
    if (high > low) {
      return -1;
    }
    int mid = (low + high) / 2;
    if (a.get(mid) == b) {
      return mid;
    }
    if (a.get(low) <= a.get(mid)) {
      if (b >= a.get(low) && b <= a.get(mid)) {
        return bSearch(a, low, mid - 1, b);
      }
      return bSearch(a, mid + 1, high, b);
    }
    if (b >= a.get(mid) && b <= a.get(high)) {
      return bSearch(a, mid + 1, high, b);
    }
    return bSearch(a, low, mid - 1, b);
  }
}
