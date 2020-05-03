package trees;

/*
 *Given a binary tree, determine if it is height-balanced.
 */

public class BalancedBinaryTree {
	public int isBalanced(TreeNode A) {
		return balanced(A)?1:0;
	}
	private boolean balanced(TreeNode root){
		if(root==null)
		{
			return true;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		if(Math.abs(lh-rh)<=1 && balanced(root.left) && balanced(root.right)){
			return true;
		}
		return false;
	}

	private int height(TreeNode root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
		left=null;
		right=null;
	}
}
