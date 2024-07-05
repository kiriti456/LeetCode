class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n:nums)
            s.add(n);
        int ans=0,count=0;
        for(int n:s){
            while(s.contains(n++)){
                count++;
            }
            ans = Math.max(ans,count);
            if(count == s.size()) break;
            count=0;
        }
        System.out.println(s);
        return ans;
    }
}