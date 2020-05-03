package stacksandqueues;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 */
public class EvaluateExpression {
	public int evalRPN(ArrayList<String> A) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i).equals("+")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a + b);
			} else if (A.get(i).equals("-")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a - b);
			} else if (A.get(i).equals("*")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a * b);
			} else if (A.get(i).equals("/")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a / b);
			} else {
				st.push(Integer.parseInt(A.get(i)));
			}
		}
		return st.peek();
	}
}
