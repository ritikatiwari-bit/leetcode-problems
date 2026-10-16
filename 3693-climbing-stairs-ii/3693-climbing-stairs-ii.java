class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return climb(n,n,dp,costs);

    }
    private int climb(int i,int n,int[] dp,int[] cost){
        //if(i<0 ) return (int)1e9;
        if(i==0 ) return 0;
        // if i>0 

        if(dp[i] != -1) return dp[i];

        int op1=climb(i-1,n,dp,cost)+(cost[i-1]+1);
        int op2= i-2 >= 0 ? (cost[i-1]+4)+climb(i-2,n,dp,cost) : (int) 1e9;
        int op3= i-3 >= 0 ? climb(i-3,n,dp,cost)+(cost[i-1]+9) : (int) 1e9;

        dp[i]=Math.min(op3,Math.min(op1,op2));
        return dp[i];
    }
}