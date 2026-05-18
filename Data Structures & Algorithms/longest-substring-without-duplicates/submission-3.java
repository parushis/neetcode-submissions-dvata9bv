class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> temp = new HashSet<>();
        char[] input = s.toCharArray(); 
        int max = 0;  

        // iterate through the array, and add unique values to a set. 
        for (int i = 0, j = 0; j < input.length; j++) {
            // "dvdf"
            if (!temp.contains(input[j])) {
                temp.add(input[j]); // {"d","f"}
            } else {
                max = Math.max(temp.size(),max); // max = 1
                // remove duplicate and iterate pointer
                while(temp.contains(input[j])) {
                    temp.remove(input[i]);
                    i++;
                }
                temp.add(input[j]);
                // calculate the max 
                max = Math.max(temp.size(),max); // max = 1
            }
        }

        max = Math.max(temp.size(),max); 
        
        return max; 
        
    }
}
