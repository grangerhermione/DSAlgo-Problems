package linkedlists;

/*
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapListNodesInPairs {
  public ListNode swapPairs(ListNode A) {
    ListNode curr = A;
    while (curr != null && curr.next != null) {
      int temp = curr.val;
      curr.val = curr.next.val;
      curr.next.val = temp;
      curr = curr.next.next;
    }
    return A;
  }
}
