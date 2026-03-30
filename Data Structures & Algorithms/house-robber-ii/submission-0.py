class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        def rob_liner(nums):
            prev,curr=0,0
            for i in nums:
                prev,curr=curr,max(curr,prev+i)
            return curr
        return max(rob_liner(nums[1:]),rob_liner(nums[:-1]))
        