class Solution {public int solve(String t1,String t2,int i, int j,int[][] just){//HashMap<String,Integer> just
        //empty str
        if(i>=t1.length() || j>=t2.length()) return 0;

        // String key=i+","+j;
        // //check for overlap
        // if(just.containsKey(key)) return just.get(key);
        
        if(just[i][j] != -1) return just[i][j];

        //match
        if(t1.charAt(i) == t2.charAt(j)){
            int ans= 1+ solve(t1, t2, i+1,j+1,just);
            just[i][j]=ans;
            // just.put(key,ans);
            return ans;
        }

        //not match
        int option1=solve(t1,t2,i+1,j,just);
        int option2=solve(t1,t2,i,j+1,just);

        int ans=Math.max(option1,option2);
        just[i][j]=ans;
        //just.put(key,ans);
        return ans;
    }
    
    public int longestPalindromeSubseq(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        //HashMap<String,Integer> just=new HashMap<>();

        int m=s.length();
       // Array Memorization cretion
        int[][] just= new int[m][s.length()];
        
       // initialization for no solution
        for(int j=0;j<m;j++){
            Arrays.fill(just[j],-1);
        }

        return solve(reversed,s,0,0,just);
    }
}