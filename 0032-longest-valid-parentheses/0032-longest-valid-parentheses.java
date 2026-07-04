class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(-1); 
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);                      // Store the index instead of '('
            } else {
                stack.pop();                    // Pop the matching '(' index or the boundary
                
                if (stack.empty()) {                // If stack becomes empty, this ')' is an unmatched gap.
                    stack.push(i);                  // We push its index to act as the new boundary.
                } else {
                    // Current length is (Current Index - Last Unmatched Index)
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }










        // Stack<Character> stack=new Stack<>();
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == '('){
        //         stack.push('(');
        //     }
        //     else {
        //         if(!stack.empty() && stack.peek()  ==  '(' ){
        //             stack.pop();
        //             count+=2;
        //         }
        //     }
        // }
        // return count;
}