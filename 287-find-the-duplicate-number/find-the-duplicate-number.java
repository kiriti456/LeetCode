class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
            else
                i++;
        }
        for(int x=0; x<nums.length; x++){
            if(x+1 != nums[x])
                return nums[x];
        }
        return 0;
    }
}