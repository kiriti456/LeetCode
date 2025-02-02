class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String st : str){
            for(int i = st.length()-1 ; i>=0 ; i--){
                ans.append(st.charAt(i));
            }
            ans.append(" ");
        }
        return ans.toString().substring(0, ans.length()-1);
    }
}