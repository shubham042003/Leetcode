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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=new ListNode(1);
        ListNode q=a;
        ListNode t1=l1;
        ListNode t2=l2;
        int r=0;
        while(t1!=null && t2!=null){
            ListNode b=new ListNode();
            int d=t1.val+t2.val+r;
            int v=d%10;
            b.val=v;
            r=d/10;
            q.next=b;
            t1=t1.next;
            t2=t2.next;
            q=q.next;
        }
        if(t1!=null){
            while(t1!=null){
                ListNode b=new ListNode();
                int d=t1.val+r;
                int v=d%10;
                b.val=v;
                r=d/10;
                q.next=b;
                t1=t1.next;
                q=q.next;
            }
        }
        if(t2!=null){
            while(t2!=null){
                ListNode b=new ListNode();
                int d=t2.val+r;
                int v=d%10;
                b.val=v;
                r=d/10;
                q.next=b;
                t2=t2.next;
                q=q.next;
            }
        }
        if(r>0){
            ListNode b=new ListNode();
            b.val=r;
            q.next=b;
        }
        return a.next;


    }
}