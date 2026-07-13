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
// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==0) return 0;
//         int n = nums.length;
//         int [] dp = new int[n];
//         Arrays.fill(dp,-1);
//         return fun(0,nums,dp);
//     }
//     public int fun(int ind, int [] nums,int [] dp){
//         if(ind >= nums.length) return 0;
//         if(dp[ind]!=-1) return dp[ind];
//         int notpick = fun(ind+1,nums,dp);
//         int pick =0;
//         if(ind<nums.length){
//             pick = nums[ind] + fun(ind+2,nums,dp);
//         }
//         return dp[ind]=Math.max(pick,notpick);
//     }
// }

//  this is tabulation
// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int [] dp = new int[n];
//         dp[0]=nums[0];
//         for(int ind =1;ind<nums.length;ind++){
//             int take = nums[ind];
//             if(ind-2 >= 0) take=take + dp[ind-2];
//             int nottake = dp[ind-1];
//             dp[ind]=Math.max(take,nottake);
//         }
//         return dp[n-1];   
//     }
// }

//  this is space optimaization
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int p1 = 0; 
        int p2 =0; 
        for(int ind =0;ind<n;ind++){
            int temp = Math.max(p2,p1+nums[ind]);
            p1=p2;
            p2=temp;
        }
        return p2;   
    }
}
