class Solution {

    public int lastOne(List<Integer> s, int k, int ind){
        if(s.size()==1){
            return s.get(0);
        }
        ind = ((ind+k-1)%s.size());
        s.remove(ind);
        return lastOne(s, k, ind);
    }

    public int findTheWinner(int n, int k) {
        List<Integer> s = new ArrayList<>();
        for(int i=1;i<=n;i++)
            s.add(i);
        return lastOne(s, k, 0);
    }
}