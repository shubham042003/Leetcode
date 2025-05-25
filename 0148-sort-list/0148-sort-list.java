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
    public ListNode sortList(ListNode head) {
        ListNode t=head;
        int n=0;
        while(t!=null){
            n++;
            t=t.next;
        }
        t=head;
        int a[]=new int[n];
        int i=0;
        while(t!=null){
            a[i]=t.val;
            t=t.next;
            i++;
        }
        t=head;
        Arrays.sort(a);
        i=0;
        while(t!=null){
            t.val=a[i];
            t=t.next;
            i++;
        }
        return head;
    }
}