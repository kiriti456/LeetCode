class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int len = word1.length() < word2.length() ? word1.length() : word2.length();
        for(int i=0; i<len; i++){
            result += Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(i));
        }
        if(word1.length() == len)
            result += word2.substring(len, word2.length());
        else
            result += word1.substring(len, word1.length());
        return result;
    }
}