# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None :
            return None
        
        nodes=[]
        cur=head
        while cur:
            nodes.append(cur)
            cur=cur.next
        length=len(nodes)
        if length==n:
            return head.next
        nodes[length-n-1].next=nodes[length-n].next if (length -n) <length else None
        return head
        
        