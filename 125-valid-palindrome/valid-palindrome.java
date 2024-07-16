class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c: s.toLowerCase().toCharArray())
            if(Character.isAlphabetic(c) || Character.isDigit(c))
                str+=c;
        for(int i=0;i<str.length()/2;i++)
            if(!(str.charAt(i) == str.charAt(str.length()-1-i)))
                return false;
        return true;
    }
}