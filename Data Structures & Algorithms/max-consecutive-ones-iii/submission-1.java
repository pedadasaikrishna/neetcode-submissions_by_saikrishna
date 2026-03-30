class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0 ,r =0 , cnt=0;
        while(r<nums.length){
            k-=nums[r]==0? 1 : 0;
            while(k<0){
                k+=nums[l]==0?1:0;
                l++;
            }
            cnt=Math.max(cnt,r-l+1);
            r++;
        }
        return cnt;
    }
}