package arrays;

import java.util.ArrayList;

/*
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 */
public class SpiralOrderMatrix2 {
  public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(A);
    for (int i = 0; i < A; i++) {
      ArrayList<Integer> temp = new ArrayList<Integer>(A);
      for (int j = 0; j < A; j++) {
        temp.add(0);
      }
      result.add(temp);
    }
    int r = 0, c = 0, i;
    int n = 1;
    int row = A, col = A;
    while (r < col && c < row) {
      for (i = c; i < col; i++) {
        result.get(r).set(i, n);
        n++;
      }
      r++;
      for (i = r; i < row; i++) {
        result.get(i).set(col - 1, n);
        n++;
      }
      col--;
      if (r < row) {
        for (i = col - 1; i >= c; i--) {
          result.get(row - 1).set(i, n);
          n++;
        }
        row--;
      }
      if (c < col) {
        for (i = row - 1; i >= r; i--) {
          result.get(i).set(c, n);
          n++;
        }
        c++;
      }
    }
    return result;
  }
}
