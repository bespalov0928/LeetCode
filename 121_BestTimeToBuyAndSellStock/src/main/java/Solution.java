public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int index = 0; index < prices.length; index++) {
            minPrice = Math.min(prices[index], minPrice);
            profit = Math.max(prices[index] - minPrice, profit);
        }
        return profit;
    }
}
