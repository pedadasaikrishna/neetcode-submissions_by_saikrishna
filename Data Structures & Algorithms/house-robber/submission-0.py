class Solution:
    def rob(self, nums: List[int]) -> int:
        dp=[-1]*len(nums)
        def fun(i,dp,nums):
            if dp[i]!=-1:
                return dp[i]

            if i==0:
                return nums[i]
            if i <0:
                return 0
            pick=nums[i]+fun(i-2,dp,nums)
            
            notpick=0+fun(i-1,dp,nums)
            dp[i]=max(pick,notpick)
            return dp[i]
        return fun(len(nums)-1,dp,nums)

        