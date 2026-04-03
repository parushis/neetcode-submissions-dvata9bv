class Solution {
    /*
    Assumptions:
        - contains exact same characters as another string
            maybe in a different order.
        - So we want to count the distinct letters in each
            and compare them.
    */
    public boolean isAnagram(String s, String t) {

        // Step 0: Create a map
        HashMap<Character,Integer> store = new HashMap<>();

        // Step 1: Read in string, put characters into a map with count.
        analyze(s,store);

        // Step 2: Read through the second string and confirm
        boolean anagram = checker(t,store);

        // Step 3: If any value is not zero after the checker,
        // it's not an anagram
        for (Integer value : store.values()) {
            if (value != 0)
                return anagram = false;
        }

        // Step 3: Return
        return anagram;
    }

    // Input : String s
    // Output: Updated Map with distinct characters and counts
    private void analyze(String s, HashMap<Character,Integer> map) {
        char[] input = s.toCharArray();

        // Step 1: Iterate
        for(int i=0; i <input.length; i++) {
            // Step 2 : check if already exists
            if(map.containsKey(input[i])) {
                // Step 3: update counter
                int counter = map.get(input[i]);
                map.put(input[i], ++counter);
            } else {
                // Step 3: add new value
                map.put(input[i], 1);
            }
        }
    }

    // Input : String to compare, and Hashmap to compare against.
    // Output: Boolean
    private boolean checker(String t, HashMap<Character,Integer> map) {
        // Step 0: Prep String to read
        char[] input = t.toCharArray();
        boolean anagram = false;

        // Step 1: Iterate string
        for (int i=0; i < input.length; i++) {
            // Step 2: Compare against store
            if(map.containsKey(input[i])) {
                // Map has key - check if count exists
                int counter = map.get(input[i]);
                if (counter == 0) {
                    // all out of those letters
                    return anagram = false;
                } else {
                    // count the letter as 'used'
                    map.put(input[i], --counter);
                    anagram = true; 
                }
            } else {
                // Map didn't have the key. Break and return false.
                anagram = false;
                return anagram;
            }
        }


        // return final value.
        return anagram;
    }

}
