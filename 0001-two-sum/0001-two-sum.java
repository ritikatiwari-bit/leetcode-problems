class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){            //bruteforce method
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};



        // Map<Integer, Integer> mp= new HashMap<>();
        //int n =nums.length;

        // for(int i=0;i<n;i++){
        //     mp.put(nums[i],i);
        // }

        // for(int i=0;i<n;i++){
        //     int comp=target-nums[i];
        //     if (mp.containsKey(comp) ){         //&& mp.get(comp) != i){
        //         return new int[]{i,mp.get(comp)};
        //     }
        //     mp.put(nums[i],i);
        // }
        // return new int[]{};


        //int i=0,j=nums.length - 1;
        // while(i<=j){
        //     int sm=nums[i]+nums[j];
        //     System.out.println(sm);
        //     if (sm==target){                 //for sorted array
        //         return new int[]{i,j};
        //     }
        //     else if(sm<target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        //return new int[]{0};


        
    }
}