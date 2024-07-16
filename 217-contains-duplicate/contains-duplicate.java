class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        for(int i : nums)
            if(s.get(i)==null)
                s.put(i,1);
            else
                return true;
        return false;
    }
}