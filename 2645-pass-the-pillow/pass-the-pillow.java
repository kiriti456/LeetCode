class Solution {
    public int passThePillow(int n, int time) {
        int c=0;
        if(n>time)
            return time+1;
        if(n==time)
            return n-1;
        while(n<=time){
            c++;
            time -= n-1;
        }
        if(c%2==0)
            return time+1;
        return n-time;
    }
}