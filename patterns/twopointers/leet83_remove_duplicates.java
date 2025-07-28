
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

    public ListNode deleteDuplicates(ListNode head) {
        //we got to assign head to temporary cuz else it changes the order of LinkedList. 
        ListNode temporary = head;
        while (temporary != null && temporary.next != null) {
            //Start a while loop that continues until current reaches the end of the list or current.next reaches null.
            if (temporary.val == temporary.next.val) {
                temporary.next = temporary.next.next;
            } else {
                temporary = temporary.next;
            }
        }
        return head; // we traverse with temporary but we return it with head at the last. 

    }
}
