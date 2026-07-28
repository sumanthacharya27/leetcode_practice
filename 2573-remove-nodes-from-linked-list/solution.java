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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr= head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode newhead=new ListNode(-1);
        ListNode dummy= newhead;
        
        while(head!=null){
            if(head.val>=newhead.val){
                ListNode newnode= new ListNode(head.val,null);
                newhead.next=newnode;
                newhead=newhead.next;
            }
            head=head.next;
        }
        return reverse(dummy.next);
    }
}
