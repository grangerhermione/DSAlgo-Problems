package stacksandqueues;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Given n non-negative integers representing the histogram’s bar height where the width of each bar
 * is 1, find the area of largest rectangle in the histogram.
 */
public class LargestRectangleInHistogram {
  public int largestRectangleArea(ArrayList<Integer> A) {
    Stack<Integer> st = new Stack<>();
    int maxArea = 0;
    int i = 0;
    for (; i < A.size(); i++) {
      if (st.isEmpty() || A.get(st.peek()) <= A.get(i)) {
        st.push(i);
      } else {
        int top = st.peek();
        st.pop();
        int area = A.get(top) * (st.isEmpty() ? i : i - st.peek() - 1);
        if (area > maxArea) {
          maxArea = area;
        }
      }
    }
    while (!st.isEmpty()) {
      int top = st.peek();
      st.pop();
      int area = A.get(top) * (st.isEmpty() ? i : i - st.peek() - 1);
      if (area > maxArea) {
        maxArea = area;
      }
    }
    return maxArea;
  }
}
