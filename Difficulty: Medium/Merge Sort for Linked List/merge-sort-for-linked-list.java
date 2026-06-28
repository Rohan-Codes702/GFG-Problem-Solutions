/* Structure of a Linked List node
class Node {
	int data;
	Node next;
	Node(int key) {
		data = key;
		next = null;
	}
} */

class Solution {
	public Node mergeSort(Node head) {
		// code here
		ArrayList<Integer>list = new ArrayList<>();
		
		if(head==null || head.next==null){
		    return head;
		}
		
		Node temp=head;
		
		while(temp!=null){
		    list.add(temp.data);
		    temp=temp.next;
		}
		
		Collections.sort(list);
		
		temp=head;
		
		for(int i=0;i<list.size();i++){
		    temp.data=list.get(i);
		    temp=temp.next;
		}
		return head;
		
	}
}
