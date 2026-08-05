/* Node of a linked list
class Node {
	int data;
	Node next;
	Node(int d) { data = d; next = null; }
}
*/

class Solution {
	public static Node findIntersection(Node head1, Node head2) {
		// code here.
		
		int l1size = 0;
		int l2size = 0;
		
		Node t1 = head1;
		Node t2 = head2;
		
		Node n = new Node(-1);
		Node tail = n;
		
		while (t1 != null) {
			l1size++;
			t1 = t1.next;
		}
		
		while (t2 != null) {
			l2size++;
			t2 = t2.next;
		}
		
		if (l1size >= l2size) {
			HashSet<Integer>set = new HashSet<>();
			Node temp = head1;
			while (temp != null) {
				set.add(temp.data);
				temp = temp.next;
			}
			
			Node temp2 = head2;
			while (temp2 != null) {
				if (set.contains(temp2.data)) {
					tail.next = new Node(temp2.data);
					tail = tail.next;
				}
				temp2 = temp2.next;
			}
		}
		if (l1size<l2size) {
			HashSet<Integer>set = new HashSet<>();
			Node temp = head2;
			while (temp != null) {
				set.add(temp.data);
				temp = temp.next;
			}
			
			Node temp2 = head1;
			while (temp2 != null) {
				if (set.contains(temp2.data)) {
					tail.next = new Node(temp2.data);
					tail = tail.next;
				}
				temp2 = temp2.next;
			}
		}
		return	n.next;
		
	}
}
