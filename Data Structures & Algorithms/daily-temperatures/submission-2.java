class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] results = new int[temperatures.length]; 

        // Step 1: Iterate through the array 
        // Step 2: move second pointer forward if num <= curr 
        // Step 3: count up until num > curr, or 0 if never 
        // Step 4: return count in a result array for that index

        
        // [30,38,30,36,35,40,28]
        // [1,4,1,2,1,0, 0]
        for(int i=0; i <temperatures.length; i++) {
        int count = 1; 
            for(int j=i+1; j<temperatures.length; j++) {
                if (temperatures[j] <= temperatures[i]) {
                    count++;   
                } else if (temperatures[j] > temperatures[i]){
                    results[i] = count;
                    break; 
                }
            }
        }


        return results; 
        
    }
}
