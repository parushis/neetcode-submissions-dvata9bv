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
        // Write it out into a stack
        Stack<ListNode> temp = new Stack<>();

        ListNode current = head; 
        while(current != null) {
            temp.push(current); 
            current = current.next; 
        }  

        // Read it from the stack back into a Linked List 
        while(!temp.isEmpty()){
            current = temp.pop(); // initialilze 
            head = current; // set up new head 
            
            while(!temp.isEmpty()) {
                current.next = temp.pop();
                current = current.next; // move pointer forward 
            }
            current.next = null; // point final to null 

        }

        return head;
    }
}
