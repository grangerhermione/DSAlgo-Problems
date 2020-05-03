package trees;

import java.util.HashSet;

/*
 *Given a binary search tree T, where each node contains a positive integer, 
 *and an integer K, you have to find whether or not there exist two different nodes A and B 
 *such that A.value + B.value = K.
 *Return 1 to denote that two such nodes exist. Return 0, otherwise.
 */

public class TwoSumBinaryTree {
	public int t2Sum(TreeNode A, int B) {
        HashSet<Integer> hs=new HashSet<>();
        return findPair(A, B,hs)?1:0;
    }
    
    private boolean findPair(TreeNode root, int B,HashSet<Integer> hs){
        if(root==null){
            return false;
        }
        if(findPair(root.left, B, hs)){
            return true;
        }
        if(hs.contains(B-root.val)){
            return true;
        }
        else{
            hs.add(root.val);
        }
        return findPair(root.right,B,hs);
    }
}
