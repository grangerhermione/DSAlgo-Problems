package math;

/*
 * A robot is located at the top-left corner of an A x B grid The robot can only move either down or
 * right at any point in time. The robot is trying to reach the bottom-right corner of the grid
 * 
 * How many possible unique paths are there?
 * 
 * 
 */
public class GridUniquePaths {
	public int uniquePaths(int A, int B) {
		int count[][] = new int[A][B];
		for (int i = 0; i < A; i++) {
			count[i][0] = 1;
		}
		for (int i = 0; i < B; i++) {
			count[0][i] = 1;
		}
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				count[i][j] = count[i - 1][j] + count[i][j - 1];
			}
		}
		return count[A - 1][B - 1];
	}
}
