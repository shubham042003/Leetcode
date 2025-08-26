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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t=head;
        int s=0;
        while(t!=null){
            s++;
            t=t.next;
        }
        if(s==1){
            head=head.next;
            return head;
        }
        s=s-n-1;
        t=head;
        if(s<0){
            head=head.next;
            return head;
        }

        while(s!=0){
            t=t.next;
            s--;
        }
        t.next=t.next.next;
        return head;
    }
}