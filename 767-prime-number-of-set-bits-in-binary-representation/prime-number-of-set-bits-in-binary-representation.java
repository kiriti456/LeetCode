class Solution {

    public boolean isSetBit(int n, int i){
        return (n>>i)%2 == 1;
    }

    public boolean isPrime(int n){
        if(n==2)
            return true;
        if(n==1 || n%2==0)
            return false;
        for(int i=3; i<n/2;i+=2){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right;i++){
            int setNum = 0;
            for(int j=0;j<=31; j++){
                if(isSetBit(i,j))
                    setNum+=1;
            }
            if(isPrime(setNum))
                count++;
        }
        return count;
    }
}