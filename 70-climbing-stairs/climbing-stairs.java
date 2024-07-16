class Solution {
    public static Map<Integer,Integer> s = new HashMap<>();
    public int steps(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        if(s.get(n)!=null)  
            return s.get(n);
        int x = steps(n-1) + steps(n-2);
        s.put(n, x);
        return x;
    }

    public int climbStairs(int n) {
        return steps(n);
    }
}