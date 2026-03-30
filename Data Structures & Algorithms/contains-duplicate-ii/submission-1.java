class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l =0 ,r =1;
        while(r<nums.length){
            if(nums[l]==nums[r]){
                if(r-l <= k){
                    // System.out.println(nums[l] + " ->"+nums[r] + " , :" + (r-l) );
                    return true;
                }
                l++;
            }
            r++;
        }
        return false;
    }
}