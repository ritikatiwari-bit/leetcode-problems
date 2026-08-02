class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length,large,sndlarge;

        large=nums[n-1];
        sndlarge=nums[n-2];
        
        
        return (large-1)*(sndlarge-1);

    }
}