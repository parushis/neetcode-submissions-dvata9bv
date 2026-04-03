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

        // Read through linked list and store into a LIFO stack 
        Stack<ListNode> temp = new Stack<>(); 
        ListNode current = head; // set up pointer

        while(current != null) {
            temp.push(current);
            current = current.next; // increase pointer 
        }

        // Read through stack and rebuild list. 
        while(!temp.isEmpty()) {
            current = temp.pop(); // initalize the linked list 
            head = current; // set up head to this value 

            while(!temp.isEmpty()) {
                current.next = temp.pop(); 
                current = current.next; // increase pointer 
            }
             current.next = null; // set last value to null 
            
        }
       

        return head; 

    }
}
