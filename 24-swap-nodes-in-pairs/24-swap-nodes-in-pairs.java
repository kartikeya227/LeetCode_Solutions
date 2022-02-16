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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return head;
        return swapLL(head, head.next);
    }
     public ListNode swapLL(ListNode n1, ListNode n2){
         if(n1==null || n2==null)
             return n1;
         n1.next = swapLL(n1.next!=null?n1.next.next:null, n2.next!=null?n2.next.next:null);
         n2.next=n1;
         return n2;
    }
}