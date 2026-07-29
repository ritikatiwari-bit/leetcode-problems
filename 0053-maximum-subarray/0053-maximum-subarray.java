class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,smM=nums[0];
        int sm=nums[0];
        for(int i=1;i<n;i++){
            sm=Math.max(nums[i],sm+nums[i]);
            smM=Math.max(sm,smM);
        }
        return smM;
    }
}