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
    public void reorderList(ListNode head) {
        // read in list into arraylist
        ArrayList<ListNode> temp = new ArrayList<>(); 
        ListNode curr = head; // create pointer

        
        while(curr != null) {
            temp.add(curr);
            curr = curr.next; // move forward
        }

        // now that the temp array is full of the nodes, let's swap
        int i=0; 
        int j=temp.size() -1; 
        while (i < j) {
            temp.get(i).next = temp.get(j); 
            i++;
            if (i > j) {
                break;
            }
            temp.get(j).next = temp.get(i); 
            j--;
        } 

        temp.get(i).next = null;
    }
}
