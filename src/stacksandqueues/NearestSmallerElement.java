package stacksandqueues;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Given an array, find the nearest smaller element G[i] for every element A[i] in the array such
 * that the element has an index smaller than i. Elements for which no smaller element exist,
 * consider next smaller element as -1.
 */
public class NearestSmallerElement {
  public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
    ArrayList<Integer> res = new ArrayList<Integer>(A.size());
    if (A.size() == 0) {
      return res;
    }
    res.add(-1);
    Stack<Integer> st = new Stack<Integer>();
    st.push(A.get(0));
    for (int i = 1; i < A.size(); i++) {
      int ele = A.get(i);
      if (ele > A.get(i - 1)) {
        res.add(A.get(i - 1));
        if (!st.isEmpty() && st.peek() != A.get(i - 1))
          st.push(A.get(i - 1));
      }
      // if(ele>st.peek()){
      // res.add(st.peek());
      // }
      else {
        int top = st.peek();
        while (!st.isEmpty()) {
          top = st.peek();
          if (top < ele) {
            break;
          }
          st.pop();
        }
        if (st.isEmpty()) {
          res.add(-1);
          st.push(ele);
        } else {
          res.add(top);
        }
        // res.add(-1);
        // st.pop();
        // st.push(ele);
      }
    }
    return res;
  }
}
