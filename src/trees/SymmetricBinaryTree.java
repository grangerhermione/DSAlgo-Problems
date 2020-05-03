package trees;

/*
 *Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */

public class SymmetricBinaryTree {
	public int isSymmetric(TreeNode A) {
		return isMirror(A.left,A.right)?1:0;
	}
	public boolean isMirror(TreeNode root1, TreeNode root2){
		if(root1==null && root2==null){
			return true;
		}
		if(root1==null || root2==null){
			return false;
		}
		return root1.val==root2.val && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
	}
}
