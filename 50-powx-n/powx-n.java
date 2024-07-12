class Solution {
    public double myPow(double x, int n) {
        if(x==1)
            return 1;
        if(x==-1){
            if(n%2==0)
                return 1;
            else
                return -1;
        }
        if(n>=Integer.MAX_VALUE)
            return (int)Math.abs(x)==0?0:myPow(x,n);
        if(n<=Integer.MIN_VALUE)
            return (int)Math.abs(x)>1?0:myPow(x,n);
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n<0){
            return (1/x)*myPow(1/x,(-1*n)-1);
        }

        return x*myPow(x,n-1);
    }
}