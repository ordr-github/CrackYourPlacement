class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-buy);
        }
        return maxProfit;
    }
}