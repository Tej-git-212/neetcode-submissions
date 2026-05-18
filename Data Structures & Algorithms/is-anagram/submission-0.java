class Solution {
    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < ls; i++) {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < lt; i++) {
            if(hs.get(t.charAt(i)) == null) return false;
            hs.put(t.charAt(i), hs.get(t.charAt(i))-1);
        }
        for(Character i : hs.keySet()) {
            if(hs.get(i) != 0) return false;
        }
        return true;
    }
}
