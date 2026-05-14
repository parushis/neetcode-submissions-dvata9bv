class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two pointer sol
        for(int i=0; i < nums.length; i++) {
            // second pointer :
            int difference = target - nums[i]; 
            for (int j= i+1; j < nums.length; j++) {
                if (nums[j] == difference) {
                    int[] sol = new int[]{i,j}; 
                    return sol;            
                }
            }
             
        }
        return null;
        
    }
}
