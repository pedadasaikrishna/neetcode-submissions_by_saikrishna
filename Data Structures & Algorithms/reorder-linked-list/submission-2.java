/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode s = head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                break;
            }
        } 
        ListNode curr = s.next;
        s.next=null;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        ListNode first = head,second=prev;
        while(first!=null && second!= null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next=second;
            second.next=temp1;
            first = temp1;
            second = temp2;
        }

    }
}
