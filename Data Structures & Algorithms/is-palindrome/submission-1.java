class Solution {
 public boolean isPalindrome(String s) {
        // O(n) is the Goal

        char[] input = s.replaceAll("\\p{Punct}","").replaceAll(" ","").toLowerCase().toCharArray();
        int j = input.length - 1;

        // Iterate from both ends and check values
        for(int i=0; i < input.length; i++) {

            // check if values are same
            if (input[i] == input[j]) {
                --j;
                // keep going after decrementing pointer
            } else {
                return false;
            }
        }
        return true;
    }
}
