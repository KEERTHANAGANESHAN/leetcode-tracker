// Last updated: 7/9/2026, 9:27:40 AM
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
        // Dummy node to handle edge cases (like duplicates at the head)
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // Node before the current sequence

        while (head != null) {
            // If current node is a duplicate
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with the same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev to the node after duplicates
                prev.next = head.next;
            } else {
                // No duplicate, move prev
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}