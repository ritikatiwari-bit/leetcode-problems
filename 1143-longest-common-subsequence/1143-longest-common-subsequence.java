class Solution {
    public int solve(String t1,String t2,int i, int j,HashMap<String,Integer> just){
        //empty str
        if(i>=t1.length() || j>=t2.length()) return 0;

        String key=i+","+j;
        //check for overlap
        if(just.containsKey(key)) return just.get(key);

        //match
        if(t1.charAt(i) == t2.charAt(j)){
            int ans= 1+ solve(t1, t2, i+1,j+1,just);
            just.put(key,ans);
            return ans;
        }

        //not match
        int option1=solve(t1,t2,i+1,j,just);
        int option2=solve(t1,t2,i,j+1,just);

        int ans=Math.max(option1,option2);
        just.put(key,ans);
        return Math.max(option1,option2);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String, Integer> just=new HashMap<>();

        return solve(text1,text2,0,0,just);
    }
}