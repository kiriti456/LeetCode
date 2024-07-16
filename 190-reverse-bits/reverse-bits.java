public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=31; i>=0;i--){
            if( (n>>i)%2==1 || (n>>i)%2==-1)
                res += (1<<(31-i));
        }
        return res;
    }
}