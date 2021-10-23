class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int highestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                highestPrice = prices[i];
            }
            if (prices[i] > highestPrice) {
                highestPrice = prices[i];
            }
            if (highestPrice - lowestPrice > maxProfit) {
                maxProfit = highestPrice - lowestPrice;
            }
        }
        return maxProfit;
    }
}
