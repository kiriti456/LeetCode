public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0,b=0;
        for(int i=31; i>=0;i--){
            int x = (n>>i)%2;
            if( x==1 || x==-1)
                res += (1<<b);
            b++;
        }
        return res;
    }
}