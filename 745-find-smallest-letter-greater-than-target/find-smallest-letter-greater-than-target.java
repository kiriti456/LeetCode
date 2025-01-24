class Solution {
    public int binarySearch(char[] letters, char target){
        int l = 0, h = letters.length-1;
        while(l <= h){
            int m = (l + (h-l)/2);
            if(letters[m] == target)
                return m;
            else if(letters[m] < target)
                l = m+1;
            else
                h = m-1;
        }
        return -1;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        if(target == 'z')
            return letters[0];

        int l = 0, h = letters.length-1;
        while(l <= h){
            int m = (l + (h-l)/2);
            if(letters[m] == target){
                if(m+1 <= letters.length-1){
                    if(letters[m+1] != target)
                        return letters[m+1];
                    else{
                        for(int i = m+1; i<=letters.length-1; i++){
                            if(letters[i] != target)
                                return letters[i];
                        }
                    }
                }
                return letters[0];
            }
            else if(letters[m] < target)
                l = m+1;
            else
                h = m-1;
        }
        for(int i = target; i<=122; i++){
            int x = binarySearch(letters, (char)(i));
            if(x != -1)
                return letters[x];   
        }
        return letters[0];
    }
}