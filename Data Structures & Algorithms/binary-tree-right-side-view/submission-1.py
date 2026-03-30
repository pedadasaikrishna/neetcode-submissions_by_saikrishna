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
            cur=qu.popleft()
            res.append(cur.val)
            if cur.right:
                qu.append(cur.right)
        return res
        