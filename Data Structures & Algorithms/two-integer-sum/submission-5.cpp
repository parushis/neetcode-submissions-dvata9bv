class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> valid_sums; 
        unordered_map<int,int> temp; 

        // iterate through the nums and add to a hashset 
        for(int i=0; i<nums.size();i++) {
             temp[nums[i]] = i; 
        }
        // iterate through the nums array and calculate the diff
        // based on the target. 
        for(int i=0; i<nums.size();i++) {
            int diff = target- nums[i]; 
            // if the diff is in the hashset, this is a valid tuple 
            // and we want to add it to our return. 
            if(temp.count(diff) && temp[diff] != i ) {
                return {i, temp[diff]}; 
            }

        }

        return {}; 

        
        
    }
};
