class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE, pf = 1, sf = 1, n = nums.length;
        for(int i = 0; i < n; i++) {
            if(pf == 0) pf = 1;
            if(sf == 0) sf = 1;
            
            pf = pf * nums[i];
            sf = sf * nums[n-i-1];
            res = Math.max(res, Math.max(pf, sf));
        }
        return res;
    }
}