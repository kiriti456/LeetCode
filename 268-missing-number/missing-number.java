class Solution {
    public int missingNumber(int[] nums) {
        int total = (nums.length*(nums.length+1))/2;
        int sum = 0;
        for(int n:nums)
            sum+=n;
        return total - sum;
    }
}