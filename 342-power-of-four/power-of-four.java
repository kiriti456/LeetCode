class Solution {
    public boolean isPowerOfFour(int n) {
        if(n%4 != 0 && n>4)
            return false;
        if(n==1)
            return true;
        if(n<4)
            return false;
        return isPowerOfFour(n/4);
    }
}