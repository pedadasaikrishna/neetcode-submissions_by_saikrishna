class Solution:
    def isHappy(self, n: int) -> bool:
        res=0
        seen=set()
        while res!=1:
            st=str(n)
            res=sum(int(i) for i in st)
            if res in seen:
                return False
            seen.add(res)
            
            st=res
        return True

        