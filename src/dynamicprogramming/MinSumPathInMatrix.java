package dynamicprogramming;

import java.util.ArrayList;

/*
 *Given a m x n grid filled with non-negative numbers, 
 *find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 */

public class MinSumPathInMatrix {
	public int minPathSum(ArrayList<ArrayList<Integer>> A) {
		int m=A.size();
		int n=A.get(0).size();
		int path[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			path[i][0]=Integer.MAX_VALUE;
		}
		for(int j=0;j<=n;j++){
			path[0][j]=Integer.MAX_VALUE;
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(i==1 && j==1){
					path[i][j]=A.get(i-1).get(j-1);
				}
				else{
					path[i][j]=Math.min(path[i-1][j], path[i][j-1])+A.get(i-1).get(j-1);
				}
			}
		}
		return path[m+1][n+1];
	}
}
