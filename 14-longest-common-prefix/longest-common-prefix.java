class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int i=0,j=0;
        boolean flag = false;
        if(strs.length ==1 )
            return strs[0];
        for(i=0; i<strs[0].length(); i++){
            if(flag)
                break;
            for(j=1; j< strs.length;j++){
                if(i < strs[j].length() && i < strs[j-1].length() && strs[j].charAt(i) == strs[j-1].charAt(i))
                    continue;
                else{
                    flag = true;
                    i--;
                    break;
                }
            }
        }
        if(i==0)
            return "";
        return strs[0].substring(0,i);
    }
}