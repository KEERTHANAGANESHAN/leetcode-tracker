// Last updated: 7/9/2026, 9:28:27 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify handling the head
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Compare nodes from both lists and attach the smaller one
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining part of list1 or list2
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // head of the merged list
    }
}