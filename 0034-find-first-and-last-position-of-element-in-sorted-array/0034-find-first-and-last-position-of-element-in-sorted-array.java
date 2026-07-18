class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int srt=0,ct=0;
        // Arrays.sort(nums);       input already sorted
        if (n == 0) return new int[]{-1, -1};


        for(int i=0;i<n;i++){
            if(nums[i]==target){
                srt=i;
                int j=i;
                while(j<n && nums[j]==target){
                    j++;
                }
                return new int[]{srt,--j}; 
            }
        }
        return new int[]{-1,-1};
    }
}
