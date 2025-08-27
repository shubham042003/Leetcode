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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head.next;
        ListNode s=head;
        ListNode f=head;
        while(f.next.next!=null && f.next.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        s.next=s.next.next;
        return head;
    }
}