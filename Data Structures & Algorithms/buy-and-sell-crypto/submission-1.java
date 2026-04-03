class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // starting point 
        
        // Iterate through the array
        for(int i=0; i < prices.length; i++) {
            for(int j=i+1; j < prices.length; j++) {
                // Caluclate profit 
                int profit = prices[j] - prices[i]; 

                // Set max 
                if(profit > maxProfit) {
                    maxProfit = profit; 
            }
            }



        }
        return maxProfit; 
    }
}
