package binarysearch;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * 
 * Your algorithm’s runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 */
public class SearchForARange {
  public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
    ArrayList<Integer> res = new ArrayList<>(2);
    int n = a.size();
    res.add(first(a, 0, n - 1, b, n));
    res.add(last(a, 0, n - 1, b, n));
    return res;
  }

  private int first(List<Integer> a, int low, int high, int b, int n) {
    if (low <= high) {
      int mid = low + (high - low) / 2;
      if (a.get(mid) == b && (mid == 0 || a.get(mid - 1) < b)) {
        return mid;
      } else if (a.get(mid) < b) {
        return first(a, mid + 1, high, b, n);
      } else {
        return first(a, low, mid - 1, b, n);
      }

    }
    return -1;
  }

  private int last(List<Integer> a, int low, int high, int b, int n) {
    if (low <= high) {
      int mid = low + (high - low) / 2;
      if (a.get(mid) == b && (mid == n - 1 || a.get(mid + 1) > b)) {
        return mid;
      } else if (a.get(mid) > b) {
        return last(a, low, mid - 1, b, n);
      } else {
        return last(a, mid + 1, high, b, n);
      }

    }
    return -1;
  }
}
