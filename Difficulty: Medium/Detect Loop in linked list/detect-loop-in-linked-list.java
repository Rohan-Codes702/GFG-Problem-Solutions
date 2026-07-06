/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        HashSet<Node>set=new HashSet<>();
        
        while(head!=null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }
}