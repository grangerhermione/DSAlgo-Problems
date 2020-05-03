package trees;

import java.util.ArrayList;
import java.util.Stack;

/*
 *Given a binary tree, return the postorder traversal of its nodes’ values.
 */

public class PostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode A) {
		Stack<TreeNode> st1=new Stack<>();
		Stack<TreeNode> st2=new Stack<>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		TreeNode curr=A;
		st1.push(curr);
		while(!st1.isEmpty()){
			TreeNode temp=st1.pop();
			st2.push(temp);
			if(temp.left!=null){
				st1.push(temp.left);
			}
			if(temp.right!=null){
				st1.push(temp.right);
			}

		}
		while(!st2.isEmpty()){
			res.add(st2.pop().val);
		}
		return res;
	}
}
