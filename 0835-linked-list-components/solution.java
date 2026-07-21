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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }

        int count=0;
        ListNode prev=head;
        head=head.next;
        if(set.contains(prev.val)) count=1;
        while(head!=null){
            if(set.contains(head.val) && !set.contains(prev.val)){
                count++;
            }
            // else if(set.contains(head.val)) count++;
            prev=head;
            head=head.next;
        }
        return count;
    }
}
