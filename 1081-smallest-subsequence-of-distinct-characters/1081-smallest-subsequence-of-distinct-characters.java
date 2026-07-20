class Solution {
    public String smallestSubsequence(String s) {
        // 1. Find the last position of every character in the string
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // 2. Start with an empty string for our final answer
        String result = "";
        boolean[] seen = new boolean[26];

        // 3. Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // If we already used this letter, skip it
            if (seen[curr - 'a']) {
                continue;
            }

            // While our answer is not empty...
            // AND the last letter in our answer is bigger than the current letter...
            // AND that last letter appears again later in the string...
            while (result.length() > 0 
                   && result.charAt(result.length() - 1) > curr 
                   && lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {
                
                // Get the last character so we can mark it as "not seen anymore"
                char lastChar = result.charAt(result.length() - 1);
                seen[lastChar - 'a'] = false;
                
                // "Backspace": Remove the very last character from our string
                result = result.substring(0, result.length() - 1);
            }

            // Add the current letter to the end of our answer
            result = result + curr;
            seen[curr - 'a'] = true;
        }

        return result;
    }
}
