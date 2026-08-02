class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] mx=new int[n];
        int[] prefixgcd=new int[n];

        mx[0]=nums[0];


        for(int i=1;i<n;i++){
            if(nums[i]>mx[i-1]) mx[i]=nums[i];
            else mx[i]=mx[i-1];
        }

        for(int i=0;i<n;i++){
            prefixgcd[i]=gcd(nums[i],mx[i]);
        }

        Arrays.sort(prefixgcd);

        int i=0,j=n-1;
        long sm=0;
        while(i<j){
            sm+=gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return sm;
    }

    public int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    } 
}