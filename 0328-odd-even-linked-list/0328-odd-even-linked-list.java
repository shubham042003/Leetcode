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
        ListNode e=new ListNode(0);
        ListNode o=new ListNode(0);
        ListNode te=e;
        ListNode to=o;
        ListNode t=head;

        while(t!=null){
            to.next=t;
            t=t.next;
            to=to.next;
            
            te.next=t;
            if(t==null) break;
            t=t.next;
            te=te.next;
        }
        e=e.next;
        o=o.next;
        to.next=e;
        return o;
    }
}