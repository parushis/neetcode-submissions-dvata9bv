class Solution {
    public int search(int[] nums, int target) {
        // Divide into two and if less than check left half,
        // if larger check check right half
        int middle = nums.length/2; 

        if (nums[middle] == target) {
            return middle; 
        } else if (target < nums[middle]) {
            // check left
            for(int i=middle; i >= 0; i--) {
                if(nums[i] == target) {
                    return i; 
                }
            }
        } else if (target > nums[middle]) {
            for (int i=middle; i < nums.length; i++) {
                if(nums[i] == target) {
                    return i; 
                }
            }
        } 

        return -1; 
    }
}
