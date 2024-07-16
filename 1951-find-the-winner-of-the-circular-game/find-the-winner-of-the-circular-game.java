class Solution {

    public int lastOne(List<Integer> s, int n, int k, int ind){
        if(s.size()==1){
            System.out.println(s);
            return s.get(0);
        }
        if(ind+k-1>=s.size())
            ind = ((ind+k-1)%s.size())-k+1;
        s.remove(ind+k-1);
        return lastOne(new ArrayList<>(s), n-1, k, ind+k-1);
    }

    public int findTheWinner(int n, int k) {
        List<Integer> s = new ArrayList<>();
        for(int i=1;i<=n;i++)
            s.add(i);
        return lastOne(s, n, k, 0);
    }
}