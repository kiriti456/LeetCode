class Solution {

    public List<String> adj(int n, int zero, int one, int idx,String ans, List<String> res){
        if(idx==n){
            //List<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }
        if(ans.length()==0)
            adj(n, zero+1, one, idx+1, ans+"0", res);
        if(ans.length()!=0)
            if(ans.charAt(ans.length()-1) != '0'){
                adj(n, zero+1, one, idx+1, ans+"0", res);
            }
        adj(n, zero, one+1, idx+1, ans+"1", res);
        return res;
    }

    public List<String> validStrings(int n) {
        return adj(n, 0, 0, 0, "", new ArrayList<>());
    }
}