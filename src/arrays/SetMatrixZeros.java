package arrays;

import java.util.ArrayList;

/*
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
 * 
 * Do it in place.
 */
public class SetMatrixZeros {
  public void setZeroes(ArrayList<ArrayList<Integer>> a) {
    int row = a.size();
    int col = a.get(0).size();

    boolean rowBool[] = new boolean[row];
    boolean colBool[] = new boolean[col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (a.get(i).get(j) == 0) {
          rowBool[i] = true;
          colBool[j] = true;
        }
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (rowBool[i] || colBool[j]) {
          ArrayList<Integer> temp = a.get(i);
          temp.set(j, 0);
          a.set(i, temp);
        }
      }
    }
  }
}
