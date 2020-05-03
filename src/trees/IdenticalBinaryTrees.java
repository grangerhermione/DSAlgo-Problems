package trees;
/*
 *Given two binary trees, write a function to check if they are equal or not.
 *
 *Two binary trees are considered equal if they are structurally identical and the 
 *nodes have the same value.
 *Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class IdenticalBinaryTrees {
	public int isSameTree(TreeNode A, TreeNode B) {
		return isIdentical(A,B)?1:0;
	}
	private boolean isIdentical(TreeNode root1, TreeNode root2){
		if(root1==null && root2==null){
			return true;
		}
		if(root1==null || root2==null){
			return false;
		}
		return (root1.val==root2.val && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
	}

}
