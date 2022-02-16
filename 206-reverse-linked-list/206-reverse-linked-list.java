/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode h = null;
    public ListNode reverseList(ListNode head) {
        
         reverseLL(head, null);
        return h;
    }
    public void reverseLL(ListNode current, ListNode previous){
      if(current!=null){
          reverseLL(current.next,current);
          current.next=previous;
      }else{
          h=previous;
      }
    }
}