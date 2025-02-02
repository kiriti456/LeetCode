class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // 0 type
        // 1 color
        // 2 name
        int ans = 0;
        if(ruleKey.equals("color")){
            for(List<String> l : items){
                if(l.get(1).equals(ruleValue))
                    ans++;
            }
            return ans;
        }
        if(ruleKey.equals("type")){
            for(List<String> l : items){
                if(l.get(0).equals(ruleValue))
                    ans++;
            }
            return ans;
        }
        if(ruleKey.equals("name")){
            for(List<String> l : items){
                if(l.get(2).equals(ruleValue))
                    ans++;
            }
            return ans;
        }
        return ans;
    }
}