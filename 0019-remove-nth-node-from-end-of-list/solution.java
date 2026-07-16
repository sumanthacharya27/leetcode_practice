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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast= new ListNode();
        ListNode slow= new ListNode();
        slow=head;
        fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next.next==null) slow.next=null;
        else{
            slow.next=slow.next.next;
        }
        return head;
    }
}
