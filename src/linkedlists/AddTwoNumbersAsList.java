package linkedlists;

/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in
 * reverse order and each of their nodes contain a single digit. Add the two numbers and return it
 * as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class AddTwoNumbersAsList {
	public ListNode addTwoNumbers(ListNode A, ListNode B) {
		ListNode curr1 = A;
		ListNode curr2 = B;
		ListNode res = null;
		ListNode temp = null;
		ListNode prev = null;
		int carry = 0;
		while (curr1 != null || curr2 != null) {
			int s = (curr1 != null ? curr1.val : 0) + (curr2 != null ? curr2.val : 0) + carry;
			carry = s / 10;
			temp = new ListNode(s % 10);
			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;
			if (curr1 != null) {
				curr1 = curr1.next;
			}
			if (curr2 != null) {
				curr2 = curr2.next;
			}
		}
		if (carry > 0) {
			temp.next = new ListNode(carry);
		}
		return res;
	}
}
