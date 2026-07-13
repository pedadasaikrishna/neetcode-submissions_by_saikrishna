// this is brute(rec)
// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==0) return 0;
//         return fun(0,nums);
//     }
//     public int fun(int ind, int [] nums){
//         if(ind >= nums.length) return 0;
//         int notpick = fun(ind+1,nums);
//         int pick =0;
//         if(ind<nums.length){
//             pick = nums[ind] + fun(ind+2,nums);
//         }
//         return Math.max(pick,notpick);
//     }
// }


// this is memo
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        return fun(0,nums,dp);
    }
    public int fun(int ind, int [] nums,int [] dp){
        if(ind >= nums.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int notpick = fun(ind+1,nums,dp);
        int pick =0;
        if(ind<nums.length){
            pick = nums[ind] + fun(ind+2,nums,dp);
        }
        return dp[ind]=Math.max(pick,notpick);
    }
}
