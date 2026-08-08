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
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummy=head.next;
        ListNode left=head;
        ListNode right=head.next;
        
        while(right!=null ){
            ListNode prev=left;
           left.next=right.next;
           right.next=left;
           if(left.next==null || left.next.next==null) break;
           right=left.next.next;
           left=left.next;
           prev.next=right;
        }
        return dummy;
    }
}
