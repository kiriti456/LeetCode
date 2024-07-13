class Solution {

    public List<String> GP(String s, int n, int open, int close, int idx){
        if(idx == n){
            List<String> ans = new ArrayList<>();
            ans.add(s);
            System.out.println(ans);
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if(open < n/2){
            ans.addAll(GP(s+"(", n, open+1, close, idx+1));
        }
        if(close < open){
            ans.addAll(GP(s+")", n, open, close+1, idx+1));
        }
        return ans;
    }

    public List<String> generateParenthesis(int n) {
        
        List<String> s = new ArrayList<>();
        s = GP("", n*2, 0, 0, 0);
        return s;

    }
}