package linkedlists;

/*
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * For example, Given linked list: 1->2->3->4->5, and n = 2. After removing the second node from the
 * end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNodeFromListEnd {
	public ListNode removeNthFromEnd(ListNode A, int B) {
		if (A == null)
			return null;

		ListNode fast = A;
		ListNode slow = A;

		for (int i = 0; i < B; i++) {
			if (fast == null) {
				return A.next;
			}
			fast = fast.next;
		}

		// if remove the first node
		if (fast == null) {
			A = A.next;
			return A;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return A;
		// int n=0;
		// ListNode curr=A;
		// while(curr!=null){
		// curr=curr.next;
		// n++;
		// }
		// if(B<n){
		// return A.next;
		// }
		// int nth=n-B;
		// curr=A;
		// int c=0;
		// while(curr!=null){
		// c++;
		// if(c==nth){
		// curr.next=curr.next.next;
		// }
		// curr=curr.next;
		// }
		// return A;
	}
}
