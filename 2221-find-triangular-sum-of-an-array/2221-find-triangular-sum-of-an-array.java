class Solution {
    public int triangularSum(int[] nums) {
        int[] copy=nums;
        int n=copy.length;

        for(int size=n;size>1;size--){
            for(int x =1; x<size; x++){
                copy[x-1]=(copy[x-1]+copy[x])%10;
            }
        }
        return copy[0];
    }
}