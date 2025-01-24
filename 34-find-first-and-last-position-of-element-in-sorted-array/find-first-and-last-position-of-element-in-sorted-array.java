class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a[] = {binarySearch(nums, target, true), binarySearch(nums, target, false)};
        return a;
    }
    public int binarySearch(int[] nums, int target, boolean isStart){
        int l = 0, h = nums.length-1;
        int ans = -1;
        while (l<=h){
            int m = l+ (h-l)/2;
            if(nums[m] == target){
                ans = m;
                if(isStart)
                    h = m-1;
                else
                    l = m + 1;
            }
            else if(nums[m] < target)
                l = m+1;
            else
                h = m-1;
        }
        return ans;
    }
}