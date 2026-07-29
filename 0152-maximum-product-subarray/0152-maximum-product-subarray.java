class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length,minp=nums[0],maxp=nums[0],ans=nums[0];
        for(int i=1; i<n; i++){
            int temp=maxp;
            maxp=Math.max(Math.max(maxp * nums[i], minp * nums[i]), nums[i]);
            minp = Math.min(Math.min(temp * nums[i], minp * nums[i]), nums[i]);
            
            if (maxp > ans) {
                ans = maxp;
            }
        }
        return ans;
    }
}