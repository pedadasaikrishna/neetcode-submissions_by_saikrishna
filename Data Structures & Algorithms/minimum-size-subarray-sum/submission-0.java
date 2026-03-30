class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE , l=0,r=0;
        int csum=0;
        while(r<nums.length){
            csum+=nums[r];
            while(csum>=target){
                ans=Math.min(ans,r-l+1);
                csum-=nums[l];
                l++;
            }
            r++;
        }
        return ans==Integer.MAX_VALUE ? 0 :ans;
    }
}