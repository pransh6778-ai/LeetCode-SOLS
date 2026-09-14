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
        ListNode temp=head;
        ListNode ini=head;
        if(head==null || head.next==null){
            return head;
        }
        int count=0;
        ListNode t1=head;
        while(t1!=null){
            count++;
            t1=t1.next;
        }
        k=k%count;
        while(k>0){
            ListNode back=head;
            while(back.next.next!=null){
                back=back.next;
            }
            temp=back.next;
            back.next=null;
            temp.next=ini;
            ini=temp;
            k--;
        }
        return ini;
    }
}