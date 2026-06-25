class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j=0;
        int n=nums.length;
        for(i=1;i<n;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}