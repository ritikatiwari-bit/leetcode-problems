class Solution {
    public int solve( int i,int j,int m,int n, int[][] obs,int[][] dp){
        if(i<0 || i>=m || j<0 || j>=n) return 0; //out of boundary

        if(obs[i][j] == 1) return 0; // if an obstacle at i,j

        if(i==m-1 && j==n-1) return 1; //if reach the end 

        if(dp[i][j]!= -1) return dp[i][j];

        int moveRight = solve(i,j+1,m,n,obs,dp);

        int moveDown = solve(i+1,j,m,n,obs,dp);

        dp[i][j]=moveRight + moveDown;

        return dp[i][j];

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;

        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,0,m,n,obstacleGrid,dp);
    }
}