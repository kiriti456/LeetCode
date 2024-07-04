class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[prev-2]){
                nums[prev] = nums[i];
                prev++;
            }
        }
        return prev;
    }
}