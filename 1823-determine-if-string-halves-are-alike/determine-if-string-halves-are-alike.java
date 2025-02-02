class Solution {
    public boolean halvesAreAlike(String s) {
        int c1 = 0, len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(i <= (len-1)/2){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    c1++;
            }
            else{
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    c1--;
            }
        }
        return c1 == 0 ? true:false;
    }
}