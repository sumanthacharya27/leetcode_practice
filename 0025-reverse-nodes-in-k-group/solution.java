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
    public ListNode reverse(ListNode curr){
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode newhead=null;
        ListNode temp=head;
        ListNode kthnode=head;
        ListNode prev=null;
        ListNode next;

        while(temp!=null){
            for(int i=1;i<k;i++){
                if(kthnode==null) break;
                kthnode=kthnode.next;
            }
            if(kthnode==null){
                prev.next=temp;
                break;
            }
            next=kthnode.next;
            kthnode.next=null;
            if(temp==head) newhead=kthnode;
            ListNode tempprev=reverse(temp);
            if(prev==null) prev=temp;
            else{
                prev.next=tempprev;
                prev=temp;
            }
            temp=next;
            kthnode=next;
        }
        
        return newhead;
    }
}
