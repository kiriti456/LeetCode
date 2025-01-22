class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        int m = (l+h)/2;
        int ans = 0;
        while(l <= h){
            m = l + (h-l)/2;
            if(target==nums[m]){
                return m;
            }
            else if(target < nums[m]){
                h = m-1;
            }
            else if(target > nums[m]){
                l = m+1;
            }
        }
        return l;
    }
}