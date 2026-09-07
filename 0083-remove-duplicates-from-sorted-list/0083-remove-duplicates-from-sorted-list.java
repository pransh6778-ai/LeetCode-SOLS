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
        ListNode temp=head;
        ListNode prev= new ListNode(-100);
        while(temp != null){
            if(temp.val == prev.val){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}