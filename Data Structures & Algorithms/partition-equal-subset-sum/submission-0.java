class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i :nums){
            total+=i;
        }
        if(total%2!=0) return false;
        int tsum=total/2;
        boolean dp [] = new boolean[tsum+1];
        dp[0]=true;
        for(int num : nums){
            for(int i = tsum;i>=num;i--){
                dp[i]=dp[i] || dp[i-num];
            }
        }
        return dp[tsum];
    }
}
