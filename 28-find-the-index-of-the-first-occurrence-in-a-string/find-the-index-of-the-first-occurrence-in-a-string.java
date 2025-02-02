class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        if(hLen < nLen)
            return haystack.equals(needle)?0:-1;
        for(int i=0;i<hLen-nLen+1;i++){
            if(haystack.substring(i,i+nLen).equals(needle))
                return i;
        }
        return -1;
    }
}