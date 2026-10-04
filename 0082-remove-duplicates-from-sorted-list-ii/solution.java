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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        ListNode newhead = new ListNode();
        ListNode dummy = newhead;
        ArrayList<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((a,b)->a.getKey().compareTo(b.getKey()));
        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getValue() > 1)
                continue;
            else {
                ListNode temp = new ListNode(entry.getKey());
                newhead.next = temp;
                newhead = newhead.next;
            }
        }
        return dummy.next;
    }
}
