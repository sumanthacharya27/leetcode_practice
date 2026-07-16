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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr= new ArrayList<>();
        ListNode res= new ListNode();
        ListNode curr=new ListNode();
        res.next=curr;
        for(int i=0;i<lists.length;i++){
            ListNode temp= new ListNode();
            temp=lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(arr);
        for(int ele:arr ){
            ListNode newnode= new ListNode(ele);
            curr.next=newnode;
            curr=curr.next;
        }
        return res.next.next;
    }
}
