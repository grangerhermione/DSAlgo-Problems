package dynamicprogramming;

import java.util.ArrayList;

/*
 *Given a grid of size m * n, lets assume you are starting at (1,1) and your goal is to reach (m,n). 
 *At any instance, if you are on (x,y), you can either go to (x, y + 1) or (x + 1, y).

Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 */

public class UniquePathsInAGrid {
	public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
		int r=A.size();
		int c=A.get(0).size();
		int path[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(A.get(i).get(j)==1){
					path[i][j]=0;
				}
				if(i==0 && j==0){
					path[i][j]=1;
				}
				else if(i==0){
					path[i][j]=path[i][j-1];
				}
				else if(j==0){
					path[i][j]=path[i-1][j];
				}
				else{
					path[i][j]=path[i-1][j]+path[i][j-1];
				}

			}
		}
		return path[r-1][c-1];
	}
}
