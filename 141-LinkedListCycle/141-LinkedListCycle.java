// Last updated: 7/9/2026, 9:27:15 AM
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
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(map.containsKey(temp)) return true;
            map.put(temp,temp.val);
            temp=temp.next;
        }
        return false;
    }
}