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
        ListNode temp=head;
        ListNode dummy=new ListNode();
        ListNode back=dummy;
        if(head==null || head.next==null){
            return head;
        }
        while(temp!=null && temp.next!=null){
            back.next=temp.next;
            temp.next=back.next.next;
            back.next.next=temp;
            back=temp;
            temp=temp.next;
        }
        return dummy.next;
    }
}