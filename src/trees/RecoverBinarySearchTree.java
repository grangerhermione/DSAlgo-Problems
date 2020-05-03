package trees;

import java.util.ArrayList;

/*
 *Two elements of a binary search tree (BST) are swapped by mistake.
 *Tell us the 2 values swapping which the tree will be restored.
 */

public class RecoverBinarySearchTree {
	TreeNode first;
	TreeNode second;
	TreeNode curr;
	public ArrayList<Integer> recoverTree(TreeNode A) {
		inOrder(A);
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(second.val);
		res.add(first.val);
		return res;
	}

	private void inOrder(TreeNode root){
		if(root!=null){
			inOrder(root.left);
			if(curr==null){
				curr=root;
			}
			else{
				if(root.val<curr.val){
					if(first==null){
						first=curr;
					}
					second=root;
				}
				curr=root;
			}
			inOrder(root.right);
		}
	}
}
