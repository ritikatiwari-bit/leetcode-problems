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
       ListNode dummy=new ListNode(0);
       dummy=head;

       ListNode curr=dummy;

       while(curr!=null && curr.next!=null ){
        //int x=curr.val;
        if (curr.val==curr.next.val){
            curr.next=curr.next.next;
            //System.out.print(curr.val +" in if " );
        }
        else{
            curr=curr.next;
            //System.out.print(curr.val +" in else " +x);
        }
       }
      
       return dummy;
    }
}