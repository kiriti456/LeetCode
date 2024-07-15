class Solution {

    public List<String> adj(int n, int zero, int one, int idx,String ans){
        if(idx==n){
            List<String> res = new ArrayList<>();
            res.add(ans);
            System.out.println(ans);
            return res;
        }
        List<String> res = new ArrayList<>();
        if(ans.length()==0)
            res.addAll(adj(n, zero+1, one, idx+1, ans+"0"));
        if(ans.length()!=0)
            if(ans.charAt(ans.length()-1) != '0'){
                res.addAll(adj(n, zero+1, one, idx+1, ans+"0"));
            }
        res.addAll(adj(n, zero, one+1, idx+1, ans+"1"));
        return res;
    }

    public List<String> validStrings(int n) {
        return adj(n, 0, 0, 0, "");
    }
}