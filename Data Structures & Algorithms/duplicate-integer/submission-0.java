
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean seen = false; 
        HashMap<Integer,Integer> seenBefore = new HashMap<>();

        // Step 1: Iterate the input array 
        for (int i=0; i < nums.length; i++) {
            // Step 2: Remember what we've seen
            if (seenBefore.containsKey(nums[i])) {
                // Step 3: Change boolean seen.
                seen = true;
            } else {
                seenBefore.put(nums[i],1);
            }
            
        }
        
        return seen; 
    }
}