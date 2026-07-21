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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;  

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode previous = dummy;

        while(current != null){
            if(current.val == val){
                previous.next = current.next;
                current = current.next;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return dummy.next;        
    }
}