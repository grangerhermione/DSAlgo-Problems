package trees;

import java.util.Stack;

/*
 *Given a binary search tree, write a function to find the kth smallest element in the tree.
 */

public class KthSmallestElementInTree {
	public int kthsmallest(TreeNode A, int B) {
		Stack<TreeNode> st=new Stack<>();
		TreeNode curr=A;
		while(!st.isEmpty() || curr!=null){
			if(curr!=null){
				st.push(curr);
				curr=curr.left;
			}
			else{
				TreeNode temp=st.pop();
				B--;
				if(B==0){
					return temp.val;
				}
				curr=temp.right;
			}
		}
		return 0;
	}
}
