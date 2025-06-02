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
    public ListNode partition(ListNode head, int x) {
        ListNode a=new ListNode(0);
        ListNode ta=a;
        ListNode t=head;
        while(t!=null){
            if(t.val<x){
                ta.next=new ListNode(t.val);
                ta=ta.next;
            }
            t=t.next;
        }
        t=head;
        while(t!=null){
            if(t.val>=x){
                ta.next=new ListNode(t.val);
                ta=ta.next;
            }
            t=t.next;
        }
        return a.next;
    }
}