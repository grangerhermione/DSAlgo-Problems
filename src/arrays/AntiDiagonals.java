package arrays;

import java.util.ArrayList;

/*
 * Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
 * details.
 */
public class AntiDiagonals {
  public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
    int n = A.size();

    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(2 * n - 1);
    for (int i = 0; i < 2 * n - 1; i++) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for (int j = 0; j <= i; j++) {
        int k = i - j;
        if (j >= n || k >= n) {
          continue;
        }
        temp.add(A.get(j).get(k));
      }
      result.add(temp);
    }
    return result;
  }
}
