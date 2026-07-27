/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> map= new HashSet<>();

        ListNode cyclenode= null;
        while(head!=null){
            if(!map.isEmpty() && map.contains(head)){
                cyclenode=head;
                break;
            }
            map.add(head);
            head=head.next;
        }
        

        return cyclenode;
    }
}
