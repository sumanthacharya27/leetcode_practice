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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode dummy=new ListNode(-1,null);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;
        ListNode next=curr.next;

        for(int i=0;i<left-1;i++){
            prev=curr;
            curr=curr.next;
        }

        ListNode leftnode=prev;
        ListNode temp=curr;
        prev=null;
        for(int i=0;i<right-left+1;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        temp.next=curr;
        leftnode.next=prev;
        return dummy.next;
    }
}
