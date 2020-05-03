package trees;

import java.util.ArrayList;
import java.util.Stack;

/*
 *Given a binary tree, return the preorder traversal of its nodes’ values.
 */

public class PreorderTraversal {
	public ArrayList<Integer> preorderTraversal(TreeNode A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(A == null)
			return result;
		stack.push(A);
		while(!stack.isEmpty()){
			TreeNode popped = stack.pop();
			result.add(popped.val);
			if(popped.right != null)
				stack.push(popped.right);
			if(popped.left != null)
				stack.push(popped.left);
		}
		return result;
	}
}
