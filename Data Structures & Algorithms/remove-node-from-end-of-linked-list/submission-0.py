# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None or head.next==None:
            return None
        
        nodes=[]
        cur=head
        while cur:
            nodes.append(cur)
            cur=cur.next
        cnt=0
        cur=head
        while cur:
            cnt+=1
            if cnt==(len(nodes)-n):
                nodes[cnt-1].next=nodes[cnt].next
            cur=cur.next
        return head
        
        