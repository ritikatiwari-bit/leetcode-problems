class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length,sm=0,c=0;
        for(int i=0; i<n;i++){
            sm+=nums[i];
        }
        // if (sm%k==0){
        //     return 0;
        // }
        // while(sm%k!=0){
        //     c++;
        //     sm-=1;
        // }
        // return c;
        return sm%k;
    }
}