class Solution {
    public int subarraySum(int[] nums, int k) {
        int res =0 ;
        for(int i =0 ; i < nums.length;i++){
            int csum=0;
            for(int j = i ;j<nums.length;j++){
                csum+=nums[j];
                if(csum==k) res++;
            }
        }
        return res;
    }
}