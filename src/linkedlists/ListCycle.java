package linkedlists;

/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class ListCycle {
  public ListNode detectCycle(ListNode a) {
    ListNode fast = a;
    ListNode slow = a;
    boolean cycle = false;
    while (fast != null && fast.next != null && slow != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        cycle = true;
        break;
      }
    }
    if (!cycle)
      return null;

    fast = a;
    while (fast != null && slow != null) {
      fast = fast.next;
      slow = slow.next;
      if (fast == slow)
        return fast;
    }
    return null;
  }
}
