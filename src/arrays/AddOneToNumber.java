package arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given a non-negative number represented as an array of digits,
 * 
 * add 1 to the number ( increment the number represented by the digits ).
 * 
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class AddOneToNumber {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		Collections.reverse(A);
		int carry = 1;
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			int number = A.get(i);
			int n = number + carry;
			if (n > 9) {
				carry = n / 10;
				res.add(n % 10);
			} else {
				res.add(n);
				carry = 0;
			}
		}

		if (carry != 0) {
			res.add(carry);
		}
		Collections.reverse(res);
		for (int i = 0; i < res.size() && res.get(i) == 0; i++) {
			if (res.get(i) != 0)
				break;
			res.remove(i);
		}
		return res;
	}
}
