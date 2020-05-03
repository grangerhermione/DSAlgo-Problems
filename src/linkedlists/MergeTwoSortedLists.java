package linkedlists;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by
 * splicing together the nodes of the first two lists, and should also be sorted.
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		ListNode head = new ListNode(0);
		ListNode res = head;
		ListNode curr1 = A;
		ListNode curr2 = B;
		while (curr1 != null && curr2 != null) {
			if (curr1.val < curr2.val) {

				res.next = curr1;
				res = res.next;
				curr1 = curr1.next;
			} else if (curr1.val > curr2.val) {

				res.next = curr2;
				res = res.next;
				curr2 = curr2.next;
			} else {
				res.next = curr1;
				res = res.next;
				res.next = curr2;
				res = res.next;
				curr2 = curr2.next;
				curr1 = curr1.next;
			}

		}
		while (curr1 != null) {
			res.next = curr1;
			curr1 = curr1.next;
			res = res.next;
		}
		while (curr2 != null) {
			res.next = curr2;
			curr2 = curr2.next;
			res = res.next;
		}
		return head.next;
	}
}
