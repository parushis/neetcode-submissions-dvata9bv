class Solution {
    public int maxArea(int[] heights) {
        int length; 
        int width; 
        int maxSize = 0; 

        int i=0; 
        int j= heights.length - 1; 
        while( i < j) {
            width = j-i; 

            // compare both directions 
            if ( heights[i] > heights[j] ) {
                length = heights[j];
                j--;
            } else {
                length = heights[i];
                i++;  
            }

            maxSize = Math.max((length * width), maxSize); 
        }
        
        return maxSize; 
    }
}
