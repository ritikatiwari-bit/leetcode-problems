class Solution {
    public int m, n;
    public int[][] dp;
    private int move(int[][] grid,int i, int j){
        if(i == m-1 && j == n-1) return grid[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        if (i == m - 1){ // IF WE ARE ON THE LAST ROW, THEN GO RIGHT
            System.out.println(i+"i");
            return dp[i][j] = grid[i][j] + move(grid, i, j + 1);
        }

        if (j == n - 1) {// IF WE ARE ON THE LAST COLUMN, THEN GO DOWN
            System.out.println(j);
            return dp[i][j] = grid[i][j] + move(grid, i + 1, j);
        }

        return dp[i][j] = grid[i][j] + Math.min(move(grid, i, j + 1), move(grid, i + 1, j));
    }
    public int minPathSum(int[][] grid) {
        m=grid.length;
        n=grid[0].length;

        dp=new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        return move(grid,0,0);
    }
}