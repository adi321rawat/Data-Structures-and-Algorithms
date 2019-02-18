/*Creating a new Queue from two existion Queues
e.g
Queue 1 = 1 2 3 4 
Queue 2 = 5 6 7 8 
So Queue 3 will be = 1 5 2 6 3 7 4 8 
*/

public class Weave {
	int element[] = new int[20];
	int front = 0;
	int rear = -1;

	public void enQueue(int ele) {
		if(rear == this.element.length - 1) {
			System.out.println("Already full");
		}

		this.rear++;
		this.element[rear] = ele;
	}

	public int deQueue() {
		if(front > rear || rear == -1) {
			return -1;
		} 

		int item = this.element[front];
		front++;
		return item;
	}

	public void display() {
		for(int i=front; i<=rear; i++) {
			System.out.println(this.element[i]);
		}
	}

	public boolean peek() {
		if(front <= rear) {
			return true;
		} 
		return false;
	}

	public Weave weave(Weave w) {
		Weave ww = new Weave();

		while(this.peek() || w.peek()) {
			if(this.peek()) {
				ww.enQueue(this.deQueue());
			}	
			if(w.peek()) {
				ww.enQueue(w.deQueue());
			}
		}
		return ww;
	}

	public static void main(String[] args) {
		Weave w1 = new Weave();
		w1.enQueue(1);
		w1.enQueue(2);
		w1.enQueue(3);
		w1.enQueue(4);
		w1.display();
		System.out.println();
		
		Weave w2 = new Weave();
		w2.enQueue(5);
		w2.enQueue(6);
		w2.enQueue(7);
		w2.enQueue(8);
		w2.display();
		System.out.println();
		
		Weave w3 = w1.weave(w2);
		w3.display();
	}
}