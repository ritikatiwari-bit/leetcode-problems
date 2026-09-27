class Solution {
    public int solve(int i,int j, int m, int n,  int[][] dp){
        // robot moved out of box
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }

        if(dp[i][j]!= -1){
            return dp[i][j];
        }

        //base case
        if(i==m-1 && j==n-1) return 1;

        int right=solve(i,j+1,m,n,dp);

        int down=solve(i+1,j,m,n,dp);

        dp[i][j]=right+down;
        
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        //Array Memorization cretion
        int[][] dp= new int[m][n+1];
        
        // initialization for no solution
        for(int j=0;j<m;j++){
            Arrays.fill(dp[j],-1);
        }
        
        return solve(0,0,m,n,dp);
    }
}