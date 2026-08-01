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
    public int pairSum(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> arr= new ArrayList<>();
        int n=0;
        while(curr != null){
            n++;
            arr.add(curr.val);
            curr=curr.next;
        }
        int i=0,j=n-1;
        if (n%2 !=0) return -1;

        int res=0;
        while(i<=j){
            int x=arr.get(i)+arr.get(j);
            if(res<x) res=x;
            i++;
            j--;
        }
        return res;
    }
}