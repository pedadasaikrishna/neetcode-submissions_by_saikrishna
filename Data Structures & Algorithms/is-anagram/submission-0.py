class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s+=s
        if t in s:
            return True
        return False
        