# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        res=[]
        qu=deque([root])
        while qu:
            
            level=[]
            for _ in range(len(qu)):
                cur=qu.popleft()
                level.append(cur.val)
                if cur.left:
                    qu.append(cur.left)
                if cur.right:
                    qu.append(cur.right)
            res.append(level)
        return res

            
        