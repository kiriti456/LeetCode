class Solution {

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        else{
            int c1[] = new int[256];
            for(char c : s.toCharArray())
                c1[c]++;;
            for(char c : t.toCharArray())
                c1[c]--;
            for(int i=0;i<256;i++){
                if(c1[i] != 0)
                    return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> sub = new ArrayList<>();
            boolean flag = true, flag2 = true;;
            if(strs[i] != "_"){
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    sub.add(strs[j]);
                    if(flag2){
                        sub.add(strs[i]);
                        flag2 = false;
                    }
                    strs[j] = "_";
                    flag = false;
                }
            }
            if(flag) sub.add(strs[i]);
            ans.add(sub);
            }
        }
        for(String str : strs)
            System.out.println(str);
        return ans;
    }
}