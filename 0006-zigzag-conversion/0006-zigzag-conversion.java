class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;

        String ans="";

        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=2*(numRows-1)){
                ans += s.charAt(j);
                if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
                    ans += s.charAt(j + (2 * (numRows - 1)) - (2 * i));
                }
            }
        }

        return ans;
    }
}