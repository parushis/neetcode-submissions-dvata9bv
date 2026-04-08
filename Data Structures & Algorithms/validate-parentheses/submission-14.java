class Solution {
    public boolean isValid(String s) {
        // convert string to array
        char[] input = s.toCharArray();
        Stack<Character> temp = new Stack<>();
        boolean valid = true;

        // iterate array
        for(int i=0; i <input.length; i++) {
            // if it is opening symbol add to stack
            if (input[i] == '(' || input[i] == '{' || input[i] == '[') {
                temp.push(input[i]);
            }

           
                if (input[i] == ')') {
                    // check first if not empty 
                    // check if match
                    if (!temp.isEmpty()) {
                        if(temp.pop() != '(') {
                            valid = false;
                            break;
                        }
                    } else {
                        valid = false; 
                    }
                } else if (input[i] == '}') {
                    // check if match
                    if (!temp.isEmpty()) {
                        if(temp.pop() != '{') {
                            valid = false;
                            break;
                        }
                    } else {
                        valid = false; 
                    }
                } else if (input[i] == ']') {

                    if (!temp.isEmpty()) {
                        // check if match
                        if(temp.pop() != '[') {
                            valid = false;
                            break;
                        }
                    } else {
                        valid = false;
                    }

                }
              
        }

        if(temp.size() > 0){
            valid = false; 
        }

        return valid;
    }
}
