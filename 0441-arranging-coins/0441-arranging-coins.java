class Solution {
    public int arrangeCoins(int n) {
        long l=1,r=n;
        long m,coin;
        while (l<=r){
            m=l+(r-l)/2;
            coin=m*(m+1)/2;
            if(coin==n) return (int)m;
            else if(coin<n) 
                l=m+1;
            else
                r=m-1;
        }
        return (int)r;
        
        
        //return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }
}