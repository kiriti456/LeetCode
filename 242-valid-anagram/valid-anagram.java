class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        else{
            int c1[] = new int[256];
            for(char c : s.toCharArray())
                c1[c]++;;
            for(char c : t.toCharArray())
                c1[c]--;
            for(int i=0;i<256;i++){
                if(c1[i] != 0)
                    return false;
            }
        }
        return true;
    }
}