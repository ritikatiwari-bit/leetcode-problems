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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next== null) return head;
        

        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        ListNode curr=head;

        // post-curr-next--temp--<nxt
        // next-curr.nxt
        // temp--nxt
        //swap(curr,next)
        // post-curr

        while(curr!= null && curr.next !=null){
            pre.next=curr.next;
            curr.next=pre.next.next;// next assign
            pre.next.next=curr;
            
            pre=curr; // for next pair of nodes
            curr=curr.next; // swap link

            System.out.println(curr+"  "+pre);
        }

        return dummy.next;

    }
}