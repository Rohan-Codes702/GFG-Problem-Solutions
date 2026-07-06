/*
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	int getMiddle(Node head) {
		// code here
		Node temp1 = head;
		Node temp2 = head;
		
		if (head == null) {
			return head.data;
		}
		
		while (temp2!=null && temp2.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
			
		}
		return temp1.data;
	}
}
