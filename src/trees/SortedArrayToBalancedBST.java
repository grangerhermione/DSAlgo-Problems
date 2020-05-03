package trees;

import java.util.List;

/*
 *Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class SortedArrayToBalancedBST {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		return sortedBst(a, 0, a.size()-1);
	}

	private TreeNode sortedBst(List<Integer> a, int start, int end){
		if(start>end){
			return null;
		}
		int mid=(start+end)/2;
		TreeNode node=new TreeNode(a.get(mid));
		node.left=sortedBst(a,start, mid-1);
		node.right=sortedBst(a, mid+1,end);
		return node;
	}
}
