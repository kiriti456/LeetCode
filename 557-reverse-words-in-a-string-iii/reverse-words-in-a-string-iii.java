class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans="";
        for(String st : str){
            for(int i = st.length()-1 ; i>=0 ; i--){
                ans += st.charAt(i);
            }
            ans+=" ";
        }
        return ans.substring(0, ans.length()-1);
    }
}