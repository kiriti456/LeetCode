class Solution {

    public List<List<Integer>> sets(int a[], int k, int idx, List<Integer> l){
        if(a.length == idx){
            List<List<Integer>> ans = new ArrayList<>();
            if(l.size()==k)
                ans.add(new ArrayList<>(l));
            return ans;
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(sets(a, k, idx+1, new ArrayList<>(l)));
        l.add(a[idx]);
        ans.addAll(sets(a, k, idx+1, new ArrayList<>(l)));
        return ans;
    }

    public List<List<Integer>> combine(int n, int k) {
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = i+1;
        return sets(a, k, 0, new ArrayList<>());
    }
}