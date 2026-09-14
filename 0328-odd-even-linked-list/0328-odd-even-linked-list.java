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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode front=head.next;
        ListNode ini=front;
        while(front!=null && front.next!=null){
            temp.next=front.next;
            temp=temp.next;
            front.next=temp.next;
            front=front.next;
        }
        temp.next=ini;
        return head;
    }
}