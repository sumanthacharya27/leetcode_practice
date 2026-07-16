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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode curr= new ListNode();
        dummy.next=curr;
        ListNode t1=new ListNode();
        t1=l1;
        ListNode t2= new ListNode();
        t2=l2;
    
        int carry=0;
        while(t1!=null || t2!=null){
            int sum=0;
            ListNode newnode=new ListNode();

            if(t1!=null && t2!=null){
                sum=t1.val+t2.val+carry;
                newnode.val=sum%10;
                curr.next=newnode;
                curr=curr.next;
                if(sum>9) carry=sum/10;
                else carry=0;
                t1=t1.next;
                t2=t2.next;
            }else if(t1!=null){
                sum=t1.val+carry;
                newnode.val=sum%10;
                curr.next=newnode;
                curr=curr.next;
                if(sum>9) carry=sum/10;
                else carry=0;
                t1=t1.next;
            }else{
                sum=t2.val+carry;
                newnode.val=sum%10;
                curr.next=newnode;
                curr=curr.next;
                if(sum>9) carry=sum/10;
                else carry=0;
                t2=t2.next;
            }
        }
        if(carry>0){
            ListNode newnode= new ListNode(carry,null);
            curr.next=newnode;
            curr=curr.next;
        }
        return dummy.next.next;
    }
}
