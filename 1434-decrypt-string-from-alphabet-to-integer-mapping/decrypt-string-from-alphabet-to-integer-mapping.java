class Solution {
    public String freqAlphabets(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                result += ((char) (num + 96));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                result += ((char) (num + 96));
                i++;
            }
        }
        return result;
    }
}