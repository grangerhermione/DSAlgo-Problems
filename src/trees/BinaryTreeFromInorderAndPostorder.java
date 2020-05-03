package trees;

import java.util.ArrayList;

/*
 *Given inorder and postorder traversal of a tree, construct the binary tree.
 */
public class BinaryTreeFromInorderAndPostorder {
	public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
		int n=B.size();
		int postOrderIndex=n-1;
		Index pIndex = new Index();
		pIndex.index = n - 1;
		return buildTree(A, 0, n-1, B, pIndex);
	}

	private TreeNode buildTree(ArrayList<Integer> pre, int start, int end, ArrayList<Integer> post, Index pIndex){
		if(start>end){
			return null;
		}
		int data=post.get(pIndex.index);
		TreeNode curr=new TreeNode(data);
		(pIndex.index)--;
		if(start==end){
			return curr;
		}
		int preIndex=search(pre, start, end, data);
		curr.right=buildTree(pre,preIndex+1,end,post, pIndex);
		curr.left=buildTree(pre,start,preIndex-1,post, pIndex);

		return curr;
	}

	private int search(ArrayList<Integer> pre, int start, int end, int key){
		for(int i=start;i<=end;i++){
			if(pre.get(i)==key){
				return i;
			}
		}
		return 0;
	}
}

class Index 
{
	int index;
}
