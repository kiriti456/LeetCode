class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
            return -1;
        if(haystack.length() == needle.length())
            return haystack.equals(needle)?0:-1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            System.out.println(haystack.substring(i,i+needle.length()));
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}