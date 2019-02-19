/*Given a Linked List and an integer n,  return the element n
spaces from the last node in the list.
Assume n will always be less than the length of list.
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

public class FromLast {

	public int elementFromLast(Linklist list, int index) {
		Node fast = list.head;
		Node slow = list.head;
		while(index > 0) {
			fast = fast.next;
			index--;
		}

		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		Linklist l = new Linklist();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		FromLast fl = new FromLast();
		System.out.println(fl.elementFromLast(l,0));
		System.out.println(fl.elementFromLast(l,4));
		System.out.println(fl.elementFromLast(l,2));
	}
}