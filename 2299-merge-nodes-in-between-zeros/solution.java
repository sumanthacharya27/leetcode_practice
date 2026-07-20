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
    public ListNode mergeNodes(ListNode head) {
        ListNode newhead= new ListNode(-1);
        ListNode dummy=newhead;
        int sum=0;
        head=head.next;
        while(head!=null){
            if(head.val==0){
                ListNode newnode= new ListNode(sum);
                newhead.next=newnode;
                newhead=newhead.next;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return dummy.next;
    }
}
