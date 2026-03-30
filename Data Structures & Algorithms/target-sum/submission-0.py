class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        def fun(i,total):
            if i == len(nums):
                return 1 if ( total==target) else 0            
            return fun(i+1,total+nums[i])+fun(i+1,total-nums[i])
        return fun(0,0)