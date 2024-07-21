class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int n : nums){
            int c = 0;
            while(n!=0){
                c++;
                n = n/10;
            }
            if(c%2==0)
                ans++;
        }
        return ans;
    }
}