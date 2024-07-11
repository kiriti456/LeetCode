class Solution {
    public int steps(int num, int c){
        if(num==0)
            return c;
        if(num%2==0)
            return steps(num/2, c+1);
        else
            return steps(num-1, c+1);
    }
    public int numberOfSteps(int num) {
        return steps(num, 0);
    }
}