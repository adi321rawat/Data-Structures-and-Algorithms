/*Implementation of a Linklist with its different functions
*/

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Linklist {
	Node head;

	Linklist() {
		head = null;
	}

	public void insertFirst(int element) {
		Node n = new Node(element);
		if(this.head == null) {
			this.head = new Node(element);
		} else {
			n.next = this.head;
			this.head = n; 
		}
	}

	public void insertLast(int element) {
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

	public void insertAt(int element, int index) {
		if(this.head == null) {
			this.head = new Node(element);
			return;
		} 

		if(this.size() < index) {
			Node n = head;
			Node nn = new Node(element);
			while(n.next != null) {
				n = n.next;
			}
			n.next = nn;
			return;
		}

		if(index == 1) {
			Node n = new Node(element);
			n.next = head;
			head = n;
			return;
		}

		Node previous = this.head;
		Node n =new Node(element);
		while(index-2 > 0) {
			previous = previous.next;
			index--;
		}
		n.next = previous.next;
		previous.next = n;
	}


	public int getFirst() {
		return this.head.data;
	}

	public int getLast() {
		if(this.head == null) {
			return -1;
		}
		Node n = this.head;
		while(n.next != null) {
			n = n.next;
		}

		return n.data;
	}

	public int getAt(int index) {
		if(this.size() < index || index < 1) {
			return -1;
		} else if(index == 1) {
			return head.data;
		}

		Node n = this.head;
		index--;
		while(index > 0) {
			n = n.next;
			index--;
		}
		return n.data;
	}

	public int removeFirst() {
		int item = this.head.data;
		this.head = this.head.next;
		return item;
	}

	public int removeLast() {
		if(this.head == null) {
			return -1;
		} else if(this.head.next == null) {
			int item = this.head.data;
			this.head = null;
			return item;
		} else {
			Node n = this.head;
			while(n.next.next != null) {
				n = n.next;
			}
			int item = n.next.data;
			n.next = null;
			return item;
		}
	}

	public int removeAt(int index) {
		if(this.size() < index || index < 1) {
			return -1;
		} else if(index == 1) {
			int item = this.head.data;
			this.head = this.head.next;
			return item;
		} 

		Node previous = this.head;
		while(index-2 > 0) {
			previous = previous.next;
			index--;
		}
		int item = previous.next.data;
		previous.next = previous.next.next;
		return item;
	}

	public void clear() {
		this.head = null;
	}

	public int size() {
		if(this.head == null) {
			return -1;
		}

		int count = 1;
		Node n = this.head;
		while(n.next != null) {
			count++;
			n = n.next;
		}

		return count;
	}

	public static void main(String[] args) {
		Linklist list = new Linklist();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertAt(1, 0);
		System.out.println(list.size());
	}
}