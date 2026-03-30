class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charset=set()
        lp=0
        Max=0
        for rp in range(len(s)):
            while s[rp] in charset:
                charset.remove(s[lp])
                lp+=1
            charset.add(s[rp])
            Max=max(Max,rp-lp+1)
        return Max
        