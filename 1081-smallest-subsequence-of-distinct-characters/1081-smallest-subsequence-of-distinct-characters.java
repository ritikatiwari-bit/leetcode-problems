public class Solution {
    public String smallestSubsequence(String s) {
        // 1. Find the last position of every character in the string
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // 2. This StringBuilder will build our final answer
        StringBuilder result = new StringBuilder();
        
        // Track which characters are already inside our result
        boolean[] seen = new boolean[26];

        // 3. Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // If we already used this letter, skip it
            if (seen[curr - 'a']) {
                continue;
            }

            // Look at the last letter we added to our result.
            // If the last letter is alphabetically bigger than 'curr',
            // AND we know that old letter shows up again later in the string...
            while (result.length() > 0 && result.charAt(result.length() - 1) > curr 
                   && lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {
                
                // ...then remove that old letter so a better one can take its place
                char removedChar = result.charAt(result.length() - 1);
                seen[removedChar - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            // Add the current letter to our result
            result.append(curr);
            seen[curr - 'a'] = true;
        }

        return result.toString();
    }
}
