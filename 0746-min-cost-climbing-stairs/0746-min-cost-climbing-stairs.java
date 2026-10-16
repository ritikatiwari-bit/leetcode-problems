class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> memo = new HashMap<>();
        return Math.min(climbStairs(cost.length-1, memo,cost),climbStairs(cost.length-2, memo,cost));
    }
    
    private int climbStairs(int n, Map<Integer, Integer> memo,int[] cost) {

        if (n < 0) return 0;
        if(n==0 || n==1) return cost[n];

        if (!memo.containsKey(n)) {
            int cst=Math.min(climbStairs(n-1, memo,cost) ,climbStairs(n-2, memo,cost))+cost[n];
            memo.put(n, cst);
        }
        return memo.get(n);
    }
}
