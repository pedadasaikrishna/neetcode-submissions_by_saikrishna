class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap={}
        for ind,num in enumerate(nums):
            comp=target-num
            if comp in hmap:
                return [hmap[comp],ind]
            hmap[num]=ind

        