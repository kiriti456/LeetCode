class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
            else
                i++;
        }
        for(int x=0; x<nums.length; x++){
            if(nums[x]-1 != x)
                return x+1;
        }
        return nums.length+1;
    }
}