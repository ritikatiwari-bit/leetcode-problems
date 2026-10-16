class Solution {
    public int climbStairs(int n, int[] costs) {
        Map<Integer, Integer> dp = new HashMap<>();

        return climb(n,n,dp,costs);

    }
    private int climb(int i,int n,Map<Integer, Integer> dp,int[] cost){
        
        if(i==0 ) return 0;
        

        if(dp.containsKey(i)) return dp.get(i);

        int op1=climb(i-1,n,dp,cost)+(cost[i-1]+1);// the cost is n-1--> n so cost[n-1]
        int op2= i-2 >= 0 ? (cost[i-1]+4)+climb(i-2,n,dp,cost) : (int) 1e9; //the cost is n-2--> n so cost[n-1]
        int op3= i-3 >= 0 ? climb(i-3,n,dp,cost)+(cost[i-1]+9) : (int) 1e9; // cost[n-1]= cost of n as starting 0 index has the cost of stair 1 

        dp.put(i,Math.min(op3,Math.min(op1,op2)));
        return dp.get(i);
    }
}