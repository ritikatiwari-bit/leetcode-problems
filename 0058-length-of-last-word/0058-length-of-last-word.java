class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.trim();
        int counter=0;
        int n=st.length();
        for(int i= n-1;i>=0;i--){
            if(st.charAt(i)!= ' ') counter++;
            else {
                break;
            }
        }
        return counter++;
    }
}