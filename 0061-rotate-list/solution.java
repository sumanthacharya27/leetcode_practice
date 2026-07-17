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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null) return head;
        ListNode newhead= new ListNode();
        ListNode tail=new ListNode();
        tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        int n=k%len;
        if(n==0) return head;
        tail.next=head;
        tail=head;
        for(int i=0;i<len-n-1;i++){
            tail=tail.next;
        }
        newhead=tail.next;
        tail.next=null;
        return newhead;

    }
}
