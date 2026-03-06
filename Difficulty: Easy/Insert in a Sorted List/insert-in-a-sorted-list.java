/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node newNode=new Node(key);
        Node temp=head;
        Node prev=null;
        
        if(head==null || key<head.data){
            newNode.next=head;
            return newNode;
        }
        
        while(temp!=null && temp.data<key){
            prev=temp;
            temp=temp.next;
        }
        
        prev.next=newNode;
        newNode.next=temp;
        
        return head;
    }
}