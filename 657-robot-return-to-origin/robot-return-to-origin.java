class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, r=0, l=0, u=0,d=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if( c == 'U'){
                x += 3;
                u++;
            }
            else if(c == 'D'){
                x -= 3;
                d++;
            }
            else if(c == 'L'){
                x += 1;
                l++;
            }
            else if(c == 'R'){
                x -= 1;
                r++;
            }
        }
        return x==0 && r==l && u==d ? true: false;
    }
}