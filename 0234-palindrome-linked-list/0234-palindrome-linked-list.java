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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode back = null;
        while (slow != null) {
            ListNode temp=slow.next;
            slow.next=back;
            back=slow;
            slow=temp;
        }
        fast=head;
        slow=back;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}