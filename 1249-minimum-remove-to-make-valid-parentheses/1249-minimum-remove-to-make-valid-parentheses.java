class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st =new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(ans.length());
                ans.append('(');
            }else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    ans.append(')');
                    st.pop();
                }
            }else{
                ans.append(s.charAt(i));
            }
        }

        while (!st.isEmpty()) {
            int openBracketIndex = st.pop();
            ans.deleteCharAt(openBracketIndex);
        }

        return ans.toString();

        // if (st.isEmpty()) return ans.toString();

        // return "";
    }
}