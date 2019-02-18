/*Implemeting a queue using 2 stacks.
*/

class Stacks {
	int ar[] = new int[20];
	int top = -1;

	public void push(int ele) {
		if(top == ar.length) {
			System.out.println("Already Full");
		}

		top++;
		this.ar[top] = ele;
	}

	public int pop() {
		if(top == -1) {
			return -1;
		}

		int item = ar[top];
		top--;
		return item;
	}

	public boolean peek() {
		if(top > -1) {
			return true;
		}
		return false;
	}
}

public class QfromS {
	Stacks s1;
	Stacks s2;

	QfromS() {
		s1 = new Stacks();
		s2 = new Stacks();
	}

	public void enQueue(int element) {
		this.s1.push(element);
	}

	public int deQueue() {
		while(this.s1.top >= 0) {
			this.s2.push(this.s1.pop());
		}

		int ele = this.s2.pop();

		while(this.s2.top >= 0) {
			this.s1.push(this.s2.pop());
		}

		return ele;
	}

	public void display() {
		while(this.s1.top >= 0) {
			this.s2.push(this.s1.pop());
		}

		int i = this.s2.top;
		while(i >= 0) {
			System.out.println(this.s2.ar[i]);
			System.out.println(i);
			System.out.println();
			i--;
		}

		while(this.s2.top >= 0) {
			this.s1.push(this.s2.pop());
		}
	}

	public static void main(String[] args) {
		QfromS qfs = new QfromS();
		qfs.enQueue(1);
		qfs.enQueue(2);
		System.out.println(qfs.deQueue());
		System.out.println();

		qfs.enQueue(3);
		qfs.enQueue(4);
		System.out.println(qfs.deQueue());
		System.out.println();
		
		qfs.display();
	}
}