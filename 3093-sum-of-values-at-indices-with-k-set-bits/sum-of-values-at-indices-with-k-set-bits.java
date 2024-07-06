class Solution {
    public boolean isSet(int n,int i){
        return (n>>i)%2==1;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            int c=0;
            for(int j=0;j<32;j++){
                if(isSet(i,j))
                    c++;
            }
            if(c == k)
                sum+=nums.get(i);
        }
        return sum;
    }
}