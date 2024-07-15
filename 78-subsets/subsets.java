class Solution {

    public List<List<Integer>> sets(int a[], int idx, List<Integer> l){
        if(a.length==idx){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(l));
            return ans;
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(sets(a, idx+1, new ArrayList<>(l)));
        l.add(a[idx]);
        ans.addAll(sets(a, idx+1, new ArrayList<>(l)));

        return ans;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return sets(nums, 0, new ArrayList<>());
    }
}