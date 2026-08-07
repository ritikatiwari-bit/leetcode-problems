class Solution {
    public int countHillValley(int[] nums) {
        int n= nums.length;
        int pre=nums[0],cnt=0;
        boolean diff[]={false,false};
        for(int i=1; i<n; i++){
            while(i<n && pre==nums[i]) i++;
            
            if (i==n) break;
            
            int bigger=nums[i]>pre? 1: 0;       
            int ntbig=nums[i]>pre? 0: 1;
            diff[bigger]=true;      
            if(diff[bigger] && diff[ntbig]) cnt += 1; 
            diff[ntbig]=false;
            pre=nums[i]; 
        }

        return cnt;
    }
}