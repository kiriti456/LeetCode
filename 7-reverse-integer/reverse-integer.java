class Solution {
    public int reverse(int x) {
        long sum = 0;
        boolean flag = false;
        if(x<0){
            x = -1*x;
            flag = true;
        }
        while(x>0){
            int rem = x%10;
            sum = 10*sum+(rem);
            int tmp = (int)sum;
            if(!(sum==tmp))
                return 0;
            x/=10;
        }
        if(flag)
            sum*=-1;
        return (int)sum;
    }
}