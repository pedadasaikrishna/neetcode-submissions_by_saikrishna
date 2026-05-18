class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total =0;
        for(int i :nums){
            total+=i;
        }
        int reqsum = (total+target )/ 2;

        if(Math.abs(target) > total || (total+target ) %2!=0) return 0;

        int dp [] = new  int [reqsum+1];
        dp[0]=1;
        for(int num : nums){
            for(int i = reqsum;i>=num;i--){
                dp[i]+=dp[i-num];
            }
        }
        return dp[reqsum];
    }
}
