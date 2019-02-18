/*Stack Implementation
*/

public class Stacks {
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

	public void display() {
		for(int i=0; i<=top; i++) {
			System.out.println(this.ar[i]);
		}
	}

	public static void main(String[] args) {
		Stacks s = new Stacks();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		System.out.println();
		s.pop();
		s.pop();
		s.display();

	}
}