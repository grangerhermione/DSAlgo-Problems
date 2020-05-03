package arrays;

import java.util.ArrayList;

/*
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * You need to do this in place.
 * 
 * 
 */
public class RotateMatrix {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		for (int x = 0; x < n / 2; x++) {
			for (int y = x; y < n - 1 - x; y++) {
				int temp = a.get(x).get(y);
				a.get(x).set(y, a.get(n - 1 - y).get(x));

				a.get(n - 1 - y).set(x, a.get(n - 1 - x).get(n - 1 - y));

				a.get(n - 1 - x).set(n - 1 - y, a.get(y).get(n - 1 - x));

				a.get(y).set(n - 1 - x, temp);
			}
		}
	}
}
