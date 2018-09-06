package linkedlists;

/*
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 */
public class RotateList {
  public ListNode rotateRight(ListNode A, int B) {
    int len = 1;
    ListNode curr = A;
    ListNode head = A;
    while (curr.next != null) {
      curr = curr.next;
      len++;
    }
    curr.next = head;
    int rotateBy = B % len;
    curr = A;

    ListNode prev = null;
    int diff = len - rotateBy;
    for (int i = 0; i < diff - 1; i++) {
      curr = curr.next;
      // prev=curr;
    }
    head = curr.next;
    curr.next = null;
    return head;
    // if(prev!=null){
    // prev.next=null;
    // }
    // ListNode newHead=curr;
    // while(curr.next!=null){
    // curr=curr.next;
    // }
    // curr.next=head;
    // A=newHead;
    // return A;
  }
}
