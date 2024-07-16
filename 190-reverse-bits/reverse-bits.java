public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0,x=32;
        String s = Integer.toBinaryString(n);
        for(int i=s.length();i<32;i++)
            s = "0"+s;
        System.out.println(s);
        for(int i=31; i>=0;i--){
            x--;
            if(s.charAt(i)=='1')
                res += (1<<x);
        }
        return res;
    }
}