package stacksandqueues;

import java.util.Stack;

/*
 * Write a program to validate if the input string has redundant braces? Return 0/1
 */
public class RedundantBraces {
  public int braces(String A) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < A.length(); i++) {
      char a = A.charAt(i);
      if (a == '(' || a == '+' || a == '-' || a == '*' || a == '/') {
        st.push(a);
      } else if (a == ')') {
        char top = st.pop();
        if (top == '(') {
          return 1;
        }
        while (top != '(') {
          top = st.pop();
        }
      }
    }
    return 0;
  }
}
