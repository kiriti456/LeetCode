class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int tmp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = tmp;
            }
            else
                i++;
        }

        for(int x=0; x<nums.length; x++){
            if(nums[x]-1 != x)
                ans.add(x+1);
        }
        return ans;
    }
}