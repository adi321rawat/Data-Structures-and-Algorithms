/*Given a linked list, return true if the list
is circular, false if it is not.
*/
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

class Linklist {
	Node head;

	Linklist() {
		head = null;
	}

	public void insert(int element) {
		if(this.head == null) {
			this.head = new Node(element);
		} else {
			Node node = head;
			Node n = new Node(element);
			while(node.next!= null) {
				node = node.next;
			}
			node.next = n; 
		}
	}
}

public class CircularList {

	public boolean circular(Linklist list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Linklist l = new Linklist();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		l.head = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		CircularList cl = new CircularList(); 
		System.out.println(cl.circular(l));
	}
}