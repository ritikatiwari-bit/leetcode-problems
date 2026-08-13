class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> cn= new HashMap<>();
        int ct=0;
        String sc="";

        int n=s.length();
        int i=0,j=0;
        
        while(i<n){
            if(!(cn.containsKey(s.charAt(i))) || cn.get(s.charAt(i))< j ){
                cn.put(s.charAt(i),i);
                ct = Math.max(ct, i - j + 1);                          //sc+=s.charAt(i);
            } else {
                j = cn.get(s.charAt(i)) + 1;
                cn.put(s.charAt(i), i);
            }
            i++;
        }
        //System.out.println(sc);    sc is adding all the unique characters not only the pattern
        // ct= cn.size();
        // if (ct==0){
        //     return 1;
        // }
        return ct;
    }
}