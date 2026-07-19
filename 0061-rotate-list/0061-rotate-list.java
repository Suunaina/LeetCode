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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode curr = head;
        ListNode tail = new ListNode();

        int length = 0;

        while(curr != null){
            tail = curr;
            length = length + 1;
            curr = curr.next;
        }

        k = k % length;
        if(k == 0){
            return head;
        }
        
        curr = head;
        for(int i=0 ; i<length-k-1 ; i++){
            curr = curr.next;                
        }
        ListNode newTail = curr;
        ListNode newHead = newTail.next;
        tail.next = head;
        newTail.next = null;
        
        return newHead;
    }
}