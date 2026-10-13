class Solution {
    private int solve(int[] nums,int i,int pre,int[][] dp){

        // express everything as index
        // pick or not
        // take max
        // base case
        if(i==nums.length) return 0;

        if(dp[i][pre+1] != -1) return dp[i][pre+1];

        int len=solve(nums,i+1,pre,dp);//not take
        if(pre == -1 || nums[i]>nums[pre]){
            len=Math.max(len, 1 + solve(nums,i+1,i,dp)); // take the count
        }
        dp[i][pre+1]=len;
        return len;

    }
    public int lengthOfLIS(int[] nums) {

        int[][] dp=new int[nums.length+1][nums.length+1];
        
        for(int j=0;j<nums.length;j++)
            Arrays.fill(dp[j],-1);

        return solve(nums,0,-1,dp);
    }
}