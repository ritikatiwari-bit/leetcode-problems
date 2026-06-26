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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }

        int n=arr.size();
        int i=0,j=n-1;

        while(i<=j){
            if(arr.get(i)==arr.get(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}