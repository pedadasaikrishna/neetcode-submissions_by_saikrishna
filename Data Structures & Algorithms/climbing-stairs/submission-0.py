class Solution:
    def climbStairs(self, n: int) -> int:
        if n==0 or n==1:
            return 1
        p1,p2=1,1
        for i in range(2,n+1):
            cur=p1+p2
            p2=p1
            p1=cur
        return p1
            
        