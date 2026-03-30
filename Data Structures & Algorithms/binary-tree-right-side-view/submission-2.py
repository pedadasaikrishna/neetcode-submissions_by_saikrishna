# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if root is None:
            return []
        qu=deque([root])
        res=[]
        
        while qu:
            lev_size=len(qu)
            for i in range(lev_size):
                cur=qu.popleft()
                if (i == (lev_size-1)):
                    res.append(cur.val)
                
                if cur.left:
                    qu.append(cur.left)
                if cur.right:
                    qu.append(cur.right)
        return res
        