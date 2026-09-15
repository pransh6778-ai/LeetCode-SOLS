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
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode back=dummy;
        if(head==null || head.next==null){
            return head;
        }
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                int x=temp.val;
                while(temp!=null && temp.val==x){
                    temp=temp.next;
                }
                back.next=temp;
            }else{
                back=temp;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}