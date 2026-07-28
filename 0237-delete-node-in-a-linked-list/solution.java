/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp1= node;
        ListNode temp2=node.next;
        while(temp2.next!=null){
            temp1.val=temp2.val;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.val=temp2.val;
        temp1.next=null;
    }
}
