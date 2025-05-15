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
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }     
        int a=s-n+1;
        temp=head;
        if(a==1){
                head=head.next;
                return head;
            }
        for(int i=0;i<a-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;   
        return head;
    }
}