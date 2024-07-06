class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        int prod=1;
        for(int i=1;i<nums.length;i++){
            prod *= nums[i-1];
            left[i] = prod;
        }
        prod = 1;
        for(int i=nums.length-2; i>=0; i--){
            prod *= nums[i+1];
            right[i] = prod;
        }
        for(int i=1;i<nums.length-1; i++){
            nums[i] = right[i]*left[i];
        }
        nums[0] = right[0];
        nums[nums.length-1] = left[nums.length-1];
        return nums;
    }
}