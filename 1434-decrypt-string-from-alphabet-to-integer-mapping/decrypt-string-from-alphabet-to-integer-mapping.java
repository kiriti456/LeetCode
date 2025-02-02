class Solution {
    public String freqAlphabets(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                String x = s.charAt(i-2)+""+s.charAt(i-1);
                s = s.replaceAll((x+"#"), ((char)(Integer.parseInt(x) + 96)+""));
            }
        }
        for(int i=0;i<s.length();i++){
            char cr = s.charAt(i);
            if( cr<= '9' && cr>='1'){
                s = s.replace(cr, (char)(Integer.parseInt(cr+"") + 96));
            }
        }
        return s;
    }
}