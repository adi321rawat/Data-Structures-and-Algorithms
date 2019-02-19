/*Return the middle of the link list
If the list has even number of elements, return 
the node at the end of the first half of the list.
Don't use a counter variable
Don't retrieve the size of the list
Iteration is allowed only once
*/

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Midpoint {
	Node head;

	Midpoint() {
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

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public static void main(String[] args) {
		Midpoint list = new Midpoint();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		System.out.println(list.mid());
	}
}