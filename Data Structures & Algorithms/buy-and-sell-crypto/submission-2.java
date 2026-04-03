class Solution {
    public int maxProfit(int[] prices) {
            int maxProfit = 0; // starting point
            int minSeen = prices[0];

            // Iterate through the array
            for(int i=0; i < prices.length; i++) {

                // Set min
                if (prices[i] < minSeen) {
                    minSeen = prices[i];
                }

                // Caluclate profit
                int profit = prices[i] - minSeen;

                // Set max
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }

}
