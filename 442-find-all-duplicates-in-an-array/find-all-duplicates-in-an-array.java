class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
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
            if(nums[x]-1 != x)
                ans.add(nums[x]);
        }
        return ans;
    }
}