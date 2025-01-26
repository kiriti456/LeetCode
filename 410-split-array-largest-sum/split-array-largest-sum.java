class Solution {
    public int splitArray(int[] nums, int k) {
        int l = nums[0];
        int s = 0;
        for(int i=0; i<nums.length; i++){
            if(l < nums[i])
                l = nums[i];
            s += nums[i];
        }

        if(k == nums.length)
            return l;
        if(k == 1)
            return s;

        while(l<=s){
            int mid = l + (s-l)/2;
            int sum = 0;
            int pieces=0;
            if(l == s)
                return l;
            for(int i=0; i<nums.length; i++){
                sum+=nums[i];
                if(sum <= mid){
                }
                else{
                    sum = nums[i];
                    pieces++;
                }
            }
            pieces++;
            if(pieces <= k){
                s = mid;
            }
            else if(pieces > k)
                l = mid + 1;
        }
        return s;
    }


}