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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int maxsum=0;
        Deque<Integer> stack = new ArrayDeque<>();

        while(fast!=null){
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            maxsum=Math.max(maxsum,stack.pop()+slow.val);
            slow=slow.next;
        }
        return maxsum;
    }
}
