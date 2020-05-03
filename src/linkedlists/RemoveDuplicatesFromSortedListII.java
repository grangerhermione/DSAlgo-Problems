package linkedlists;

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct
 * numbers from the original list.
 */
public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode A) {
		ListNode dummy = new ListNode(0);

		/* dummy node points to the original head */
		dummy.next = A;
		ListNode prev = dummy;
		ListNode curr = A;
		while (curr != null) {
			while (curr.next != null && prev.next.val == curr.next.val) {
				curr = curr.next;
			}
			if (prev.next == curr) {
				prev = prev.next;
			} else {
				prev.next = curr.next;
			}
			curr = curr.next;
			// if(curr.next.val==curr.next.next.val){
			// int dup=curr.next.val;
			// while(curr.next!=null && curr.next.val==dup){
			// curr.next=curr.next.next;
			// }
			// }
			// else{
			// curr=curr.next;
			// }
			// if(curr.val==curr.next.val){
			// if(prev==null){
			// A=curr.next.next;
			// curr=A;
			// }
			// else{
			// prev.next=curr.next.next;
			// curr=prev.next;
			// }
			// }
			// else{
			// curr=curr.next;
			// prev=curr;
			// }

		}
		A = dummy.next;
		return A;
	}

}
