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
        ListNode a=new ListNode(0,head);
        ListNode p=a;
        ListNode t=head;
        while(t!=null){
            if(t.next!=null && t.val==t.next.val){
                while(t.next!=null && t.val==t.next.val){
                    t=t.next;
                }
                p.next=t.next;
                t=t.next;
            }else{
                p=t;
                t=t.next;
            }
        }
        return a.next;
    }
}