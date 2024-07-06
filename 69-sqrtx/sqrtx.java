class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==2 || x==3)
            return 1;
        if(x==0)
            return 0;
        if(x==5)
            return 2;
        for(long i=1;i<=x/2;i++){
            if(i*i > (long)x)
                return (int)i-1;
            if(i*i==(long)x)
                return (int)i;
        }
        return 0;
    }
}