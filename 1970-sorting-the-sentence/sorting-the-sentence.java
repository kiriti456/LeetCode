class Solution {
    public String sortSentence(String s) {
        String[] st = s.split(" ");
        for(int i=0;i<st.length-1;i++){
            for(int j=0; j<st.length-i-1;j++){
                if(st[j].charAt(st[j].length()-1) > st[j+1].charAt(st[j+1].length()-1)){
                    String tmp = st[j];
                    st[j] = st[j+1];
                    st[j+1] = tmp;
                }
            }
        }
        String ans="";
        for(int i=0; i<st.length-1;i++){
            ans += st[i].substring(0, st[i].length()-1)+" ";
        }
        return ans+st[st.length-1].substring(0, st[st.length-1].length()-1);
    }
}