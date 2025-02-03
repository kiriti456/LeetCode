class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        boolean flag = false;
        for(i=0; i<strs[0].length(); i++){
            if(flag)
                break;
            for(int j=1; j< strs.length;j++){
                if(i < strs[j].length() && i < strs[j-1].length() && strs[j].charAt(i) == strs[j-1].charAt(i))
                    continue;
                else{
                    flag = true;
                    i--;
                    break;
                }
            }
        }
        if(strs.length ==1 )
            return strs[0];
        if(i==0)
            return "";
        return strs[0].substring(0,i);
    }
}