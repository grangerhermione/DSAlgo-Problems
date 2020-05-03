package twopointers;

import java.util.ArrayList;

/*
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same
 * color are adjacent, with the colors in the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue
 * respectively.
 * 
 * 
 */
public class SortByColor {
	public void sortColors(ArrayList<Integer> a) {
		int n = a.size();
		int temp = 0, low = 0, mid = 0, high = n - 1;
		while (mid <= high) {
			if (a.get(mid) == 0) {
				temp = a.get(low);
				a.set(low, a.get(mid));
				a.set(mid, temp);
				mid++;
				low++;
			} else if (a.get(mid) == 1) {
				mid++;
			} else {
				temp = a.get(mid);
				a.set(mid, a.get(high));
				a.set(high, temp);
				high--;
			}

		}
	}
}
