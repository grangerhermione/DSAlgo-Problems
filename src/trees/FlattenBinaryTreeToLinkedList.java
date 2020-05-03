package trees;

/*
 *Given a binary tree, flatten it to a linked list in-place.
 */

public class FlattenBinaryTreeToLinkedList {
	public TreeNode flatten(TreeNode a) {
		TreeNode node=a;
		while(node!=null){
			if(node.left!=null){
				TreeNode rightMost=node.left;
				while(rightMost.right!=null){
					rightMost=rightMost.right;
				}
				rightMost.right=node.right;
				node.right=node.left;
				node.left=null;
			}
			node=node.right;
		}
		return a;
	}
}
