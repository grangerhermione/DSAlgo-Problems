package dynamicprogramming;

import java.util.Stack;

/*
 *Given a string A containing just the characters ’(‘ and ’)’.
 *Find the length of the longest valid (well-formed) parentheses substring.
 */

public class LongestValidParanthesis {
	public int longestValidParentheses(String A) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(-1);
        int res=0;
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    res=Math.max(res,i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return res;
    }
}
