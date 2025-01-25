class Solution {
    public int search(int[] nums, int target) {
        int peakEle = findPeak(nums);
        
        int firstHalf = binarySearch(nums, target, 0, peakEle);

        if(firstHalf != -1)
            return firstHalf;
        
        return binarySearch(nums, target, peakEle+1, nums.length-1);
    }

    public int findPeak(int[] nums){
        int l = 0, h = nums.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if (m < h && nums[m] > nums[m+1])
                return m;
            else if(m > l && nums[m-1] > nums[m])
                return m-1;
            else if (nums[l] >= nums[m]){
                h = m-1;
            }
            else
                l = m+1;
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int l, int h){
        while(l<=h){
            int m = l + (h-l)/2;
            if (target > nums[m])
                l = m+1;
            else if(target < nums[m])
                h = m-1;
            else
                return m;
        }
        return -1;
    }
}