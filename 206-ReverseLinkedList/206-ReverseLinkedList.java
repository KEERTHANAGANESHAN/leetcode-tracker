// Last updated: 7/9/2026, 9:24:34 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        while(head!=null){
           ListNode temp=head;
           head=head.next;
            temp.next=h2;
            h2=temp;
        }
        return h2;
    }
}