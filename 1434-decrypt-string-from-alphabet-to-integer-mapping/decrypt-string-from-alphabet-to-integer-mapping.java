class Solution {
    public String freqAlphabets(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                String x = s.charAt(i-2)+""+s.charAt(i-1);
                int c = (Integer.parseInt(x) + 96);
                s = s.replaceAll((x+"#"), ((char)c+""));
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) <= '9' && s.charAt(i)>='1'){
                s = s.replace(s.charAt(i), (char)(Integer.parseInt(s.charAt(i)
                +"") + 96));
            }
        }
        return s;
    }
}