package arrays;
import java.util.ArrayList;
import java.util.List;

/*
 * Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral
 * order.
 */
public class SpiralOrderMatrix1 {
  public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
    int a = 0, b = 0, i;
    int r = A.size();
    int c = A.get(0).size();
    ArrayList<Integer> res = new ArrayList<>();
    while (a < c && b < r) {
      for (i = b; i < c; i++) {
        res.add(A.get(a).get(i));
      }
      a++;
      for (i = a; i < r; i++) {
        res.add(A.get(i).get(c - 1));
      }
      c--;
      if (a < r) {
        for (i = c - 1; i >= b; i--) {
          res.add(A.get(r - 1).get(i));
        }
        r--;
      }
      if (b < c) {
        for (i = r - 1; i >= a; i--) {
          res.add(A.get(i).get(b));
        }
        b++;
      }
    }
    return res;
  }
}
