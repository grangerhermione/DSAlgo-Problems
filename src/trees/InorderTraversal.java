package trees;

import java.util.ArrayList;
import java.util.Stack;

/*
 *Given a binary tree, return the inorder traversal of its nodes’ values.
 */
public class InorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		Stack<TreeNode> st=new Stack<>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		TreeNode curr=A;
		while(curr!=null || !st.isEmpty()){
			while(curr!=null){
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			res.add(curr.val);
			curr=curr.right;
		}
		return res;
	}
}
