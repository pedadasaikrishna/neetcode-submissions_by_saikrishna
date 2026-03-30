/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();

        Node temp = head;
        while(temp!=null){
            Node nn = new Node(temp.val);
            map.put(temp,nn);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node cloned = map.get(temp);
            cloned.next = (temp.next!=null)? map.get(temp.next) : null;
            cloned.random = (temp.random!=null)? map.get(temp.random) : null;
            temp=temp.next;
        }
        return map.get(head);
    }
}
