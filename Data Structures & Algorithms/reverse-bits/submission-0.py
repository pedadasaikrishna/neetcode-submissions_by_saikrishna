class Solution:
    def reverseBits(self, n: int) -> int:
        stri=bin(n)[2:].zfill(32)
        rev_stri=stri[::-1]
        return int(rev_stri,2)
        