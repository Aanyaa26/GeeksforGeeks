Data: 22.11.24

class Solution {
    public int maximumProfit(int prices[]) {
        int profit =0;
        int n= prices.length;
        int min = prices[0];
        
        for(int i=1; i<n; i++){
            int cost = prices[i]-min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
