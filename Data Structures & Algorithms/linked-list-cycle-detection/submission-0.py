# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        li=[]
        li.append(head.next)
        head=head.next
        while head:
            if head.next in li:
                return True
            li.append(head.next)
            head=head.next
        return False
            
            

        