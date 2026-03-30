class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int l =0 , r=0 , cnt=0;
        int csum=0;
        while(r<nums.length){
            csum+=nums[r];
            while(csum>k){
                csum-=nums[l];
                l++;
            }
            if(csum==k){
                cnt++;
            }
            r++;
        }
        return cnt;

    }
}