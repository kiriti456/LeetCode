class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = name.length()-1;
        int j = typed.length()-1;
        if(name.charAt(0) != typed.charAt(0) || name.charAt(i) != typed.charAt(j))
            return false;
        if(i>j)
            return false;
        while(i >= 0 && j>=0 ){
            if(name.charAt(i) == typed.charAt(j)){
                i--;
                j--;
            }
            else if(typed.charAt(j) == typed.charAt(j + 1)){
                j--;
            }
            else
                return false;
        }
        if(i==-1)
            return true;
        return false;
    }
}