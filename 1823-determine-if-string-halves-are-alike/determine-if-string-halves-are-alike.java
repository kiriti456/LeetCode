class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = (s.substring(0, 1+(s.length() - 1) / 2)
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "")
                .replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", ""));
        String s2 = (s.substring(1 + (s.length() - 1) / 2, s.length())
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "")
                .replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", ""));
                System.out.println(s1 +" "+s2);
        System.out.println("oooooooooooottttttttttt".replace("x",""));
        return s1.length() == s2.length();
    }
}