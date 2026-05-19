class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length, i = 0, fl = strs[0].length(), el = strs[n-1].length();
        String res = "";

        while((i < Math.min(fl, el)) && (strs[0].charAt(i) == strs[n-1].charAt(i))) {
            res += strs[0].charAt(i);
            i += 1;
        }
        return res;
    }
}