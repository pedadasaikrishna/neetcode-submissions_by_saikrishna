class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l =0 , r =0 , cnt =0 , prod=1;
        while(r<nums.length){
            prod*=nums[r];
            while(l<=r && prod>=k){
                prod = prod/nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}