package linkedlists;

/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * 
 */
public class ReverseLinkedListII {
  public ListNode reverseBetween(ListNode A, int B, int C) {
    if (B == C)
      return A;

    ListNode mprev = null;
    ListNode nafter = null;
    ListNode mprevprev = null;
    ListNode temp = A;

    int i = 1;
    while (temp != null && i <= C) {

      if (i == B - 1) {
        mprevprev = temp;
      }
      if (i == B) {
        mprev = temp;
      }
      if (i == C) {
        nafter = temp.next;
        temp.next = null;
      }
      ++i;
      temp = temp.next;

    }

    if (mprev.next == null)
      return A;

    // Reverse the link list from m to n

    ListNode x = mprev;
    ListNode y = x.next;
    x.next = nafter;

    while (x != null && y != null) {
      ListNode t = y.next;
      y.next = x;
      x = y;
      y = t;
    }

    if (mprevprev != null)
      mprevprev.next = x;
    else
      return x;

    return A;

  }
}
