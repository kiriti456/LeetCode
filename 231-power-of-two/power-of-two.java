class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean neg = false;;
        if(n<0)
            return false;
        for(int i=0;i<=31;i++){
            if((1<<i)==n){
                if(neg)
                    if(i%2==1)
                        return true;
                    else
                        return false;
                return true;
            }
        }
        return false;
    }
}