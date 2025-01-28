class Solution {
    public int[] findErrorNums(int[] nums) {
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
        int missing=0, repeating=0;
        for(int i1=0;i1<nums.length; i1++){
            if(nums[i1]-1 != i1){
                missing = i1+1;
                repeating = nums[i1];
            }
        }
        return new int[]{repeating, missing};
    }
}