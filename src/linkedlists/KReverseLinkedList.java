package linkedlists;

/*
 * Given a singly linked list and an integer K, reverses the nodes of the
 * 
 * list K at a time and returns modified linked list.
 */
public class KReverseLinkedList {
  public ListNode reverseList(ListNode A, int B) {
    return reverse(A, B);
  }

  public ListNode reverse(ListNode A, int B) {
    ListNode curr = A;
    ListNode prev = null, next = null;
    int count = 0;
    while (curr != null && count < B) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
      count++;
    }
    if (next != null) {
      A.next = reverse(next, B);
    }
    return prev;
  }
}
