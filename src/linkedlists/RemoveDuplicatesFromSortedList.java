package linkedlists;

/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode A) {
    ListNode curr = A;
    while (curr.next != null) {
      if (curr.val == curr.next.val) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
    return A;
  }
}
