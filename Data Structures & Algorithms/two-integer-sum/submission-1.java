class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Goals: O(n) 
        HashMap<Integer,Integer> setMap = new HashMap<>(); 
        int[] ans = new int[2]; 

        // Iterate the nums array, return the lowest index first of the pair that adds
        // up to the target 

        // Hint : think of it in terms of a mathematical equation 
        for(int i=0; i <nums.length; i++) {
            // we want to see if the remainder exists in our map
            int toFind = target - nums[i]; 

            if (setMap.containsKey(toFind)) {
                ans[1] = i;
                ans[0] = setMap.get(toFind); 
            } else {
                // kv : number, index
                setMap.put(nums[i],i); 
            }
        }
        return ans; 
    }
}
