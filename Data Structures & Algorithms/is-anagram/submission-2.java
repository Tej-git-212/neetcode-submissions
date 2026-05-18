class Solution {
    public boolean isAnagram(String s, String t) {
        int ls = s.length(), lt = t.length();
        if(ls != lt) return false;
        int[] hs = new int[26];

        for(int i = 0; i < ls; i++) {
            hs[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < lt; i++) {
            if(hs[t.charAt(i)-'a'] == 0) return false;
            hs[t.charAt(i)-'a'] -= 1;
        }
        for(int i = 0; i < 26; i++) {
            if(hs[i] != 0) return false;
        }
        return true;
    }
}
