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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode p1 = prev.next;
            ListNode p2 = p1.next;

            ListNode next = p2.next;
            p2.next = p1;
            p1.next = next;

            prev.next = p2;
            prev = p1;
        }
        return dummy.next;        
    }
}