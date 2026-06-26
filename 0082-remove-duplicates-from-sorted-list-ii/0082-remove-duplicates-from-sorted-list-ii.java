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
        ListNode dummy=new ListNode(0);     //new list (temp1)
        dummy.next=head;                    //the next of dummy node holds the actual list

        ListNode curr=dummy;                // for traversing
        
        while(curr.next!=null && curr.next.next!=null){         //check fore dependencies
            
            if(curr.next.val==curr.next.next.val){
                int x=curr.next.val;                        //for multiple comparisions
                while (curr.next != null && curr.next.val == x) {
                    curr.next = curr.next.next;         // This is where deletion happens
                }
            }
            else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}