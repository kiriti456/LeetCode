class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        boolean flag = false;
        for(int i=0; i<nums.length;i++){         
            if(nums[i] == 1){
                if(flag && count < k)
                    return false;
                count = 0;
                flag = true;
            }
            else{
                count++;
            }
        }
        return true;
    }
}