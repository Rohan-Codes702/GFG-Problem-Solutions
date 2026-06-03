/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractionalNode(Node head, int k) {
        // Your code here
        int n=0;
        
        Node temp=head;
        
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        
        
        int s=(int) Math.ceil((double) n / k);
        int i=1;
        while(head!=null){
            if(i==s){
                return head.data;
            }
            i++;
            head=head.next;
        }
        return -1;
        
        
    }
}