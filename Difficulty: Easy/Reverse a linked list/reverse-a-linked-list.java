/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
   ArrayList<Integer>list=new ArrayList<>();
   Node temp=head;
   while(temp!=null){
       list.add(temp.data);
       temp=temp.next;
   }
   
   Collections.reverse(list);
   
   temp=head;
   int i=0;
   while(temp!=null){
       temp.data=list.get(i);
       i++;
       temp=temp.next;
   }
   
   return head;
        
    }
}