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
        ListNode curr=head;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1= reverse(l1);
        ListNode temp2= reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode sumnode=new ListNode();
        dummy.next=sumnode;
        int carry=0;
        while(temp1!=null || temp2!=null){
            if(temp1!=null && temp2!=null){
                ListNode newnode= new ListNode();
                int sum=temp1.val+temp2.val+carry;
                newnode.val=sum%10;
                carry=sum/10;
                sumnode.next=newnode;
                sumnode=sumnode.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }else if(temp1!=null){
                ListNode newnode=new ListNode();
                int sum=temp1.val+carry;
                newnode.val=sum%10;
                carry=sum/10;
                sumnode.next=newnode;
                sumnode=sumnode.next;
                temp1=temp1.next;
            }else{
                ListNode newnode=new ListNode();
                int sum=temp2.val+carry;
                newnode.val=sum%10;
                carry=sum/10;
                sumnode.next=newnode;
                sumnode=sumnode.next;
                temp2=temp2.next;
            }
        }
        if(carry>0){
            ListNode newnode=new ListNode(carry);
            sumnode.next=newnode;
            sumnode=sumnode.next;
        }
        return reverse(dummy.next.next);
    }
}
