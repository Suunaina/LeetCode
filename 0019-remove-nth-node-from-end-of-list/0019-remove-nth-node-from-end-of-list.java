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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode curr = head;
        int length = 0;
        
        while(curr != null){
            curr = curr.next;
            length++;
        }

        curr = dummy; // used because what if we need to delete the first node itself

        for(int i=0 ; i<length-n ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;      

        return dummy.next;  
    }
}