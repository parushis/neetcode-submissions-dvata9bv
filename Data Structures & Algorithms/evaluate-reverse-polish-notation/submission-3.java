class Solution {
    public int evalRPN(String[] tokens) {
            // iterate through the tokens, if it is an int
            // add it to the stack
            // otherwise pop the last 2 values from the stack and add 
            // the sol back. 

            Stack<Integer> temp = new Stack<>(); 

            for(int i=0; i < tokens.length; i++) {
                // if operator
                if(tokens[i].equals("+")) {
                    int val_a = temp.pop(); 
                    int val_b = temp.pop(); 
                    int sol = val_a + val_b; 
                    temp.push(sol); 
                } else if(tokens[i].equals("-")) {
                    int val_a = temp.pop(); 
                    int val_b = temp.pop(); 
                    int sol = val_b - val_a; 
                    temp.push(sol); 
                } else if(tokens[i].equals("*")) {
                    int val_a = temp.pop(); 
                    int val_b = temp.pop(); 
                    int sol = val_a * val_b; 
                    temp.push(sol); 
                } else if(tokens[i].equals("/")) {
                    int val_a = temp.pop(); 
                    int val_b = temp.pop(); 
                    int sol = val_b / val_a; 
                    temp.push(sol); 
                } else {
                    // int
                    temp.push(Integer.parseInt(tokens[i])); 
                }
            }

      return temp.pop();   
    }
}
