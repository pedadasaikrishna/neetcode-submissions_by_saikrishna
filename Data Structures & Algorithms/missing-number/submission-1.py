class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # res=len(nums)
        # for i in range(len(nums)):
        #     res+=i-nums[i]
        # return res
        for i in range(len(nums)):
            if i not in nums:
                return i
        