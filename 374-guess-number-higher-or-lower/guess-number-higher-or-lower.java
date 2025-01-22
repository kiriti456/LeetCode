/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int h = n, l=1;
        while(l<=h){
            int num = l + (h-l)/2;
            if(guess(num)==0)
                return num;
            else if(guess(num)==-1)
                h = num - 1;
            else
                l = num+1;
        }
        return n;
    }
}