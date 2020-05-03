package trees;

import java.util.ArrayList;

/*
 *Given preorder and inorder traversal of a tree, construct the binary tree.
 */

public class ConstructBinaryTreeFromInorderAndPreorder {
	public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
		int n=A.size();
		Index preIndex=new Index();
		preIndex.index=0;
		return buildTree(A, B, 0, n-1, preIndex);

	}

	private TreeNode buildTree(ArrayList<Integer> pre, ArrayList<Integer> in, int start, int end, Index preIndex){
		if(start>end){
			return null;
		}
		int data=pre.get(preIndex.index);
		(preIndex.index)++;
		TreeNode curr=new TreeNode(data);
		if(start==end){
			return curr;
		}
		int rootIndex=search(in, start,end, data);
		curr.left=buildTree(pre,in,start,rootIndex-1,preIndex);
		curr.right=buildTree(pre,in,rootIndex+1,end,preIndex);
		return curr;
	}

	private int search(ArrayList<Integer> in, int start, int end, int key){
		for(int i=start;i<=end;i++){
			if(in.get(i)==key){
				return i;
			}
		}
		return 0;
	}

}
