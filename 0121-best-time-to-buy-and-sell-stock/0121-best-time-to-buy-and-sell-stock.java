class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0,min=0;

        for(int i= 1;i<prices.length;i++){
            if(prices[min] > prices[i])
                min =i;
            else if(maxp < prices[i]-prices[min])
                maxp=prices[i] - prices[min];
        }

        return maxp;
    }
}