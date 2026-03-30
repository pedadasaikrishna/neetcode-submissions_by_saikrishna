class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mp=0
        Min=prices[0]
        for i in prices[1:]:
            cp=i-Min
            mp=max(mp,cp)
            Min=min(Min,i)
        return mp

        