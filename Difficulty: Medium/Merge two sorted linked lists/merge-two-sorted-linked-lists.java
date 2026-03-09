/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy=new Node(0);
        Node tail=dummy;
        
        
        Node temp1=head1;
        Node temp2=head2;
        
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
               tail.next=temp1;
               temp1=temp1.next;
            }
            else{
                tail.next=temp2;
                temp2=temp2.next;
                
            }
            tail=tail.next;
        }
        
        if(temp1!=null){
            tail.next=temp1;
        }
        if(temp2!=null){
            tail.next=temp2;
        }
        return dummy.next;
    }
}