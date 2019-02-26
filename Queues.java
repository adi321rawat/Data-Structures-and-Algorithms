/*Program to implement a Queue
*/

/*Queue is an interface, 
so we have to  use one of 
it's implementing classes
1. Linked List 
2. Priority Queue
*/

import java.util.*;

public class Queues {
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<4;i++) {
			q.add(i);
		}

		System.out.println(q);

		System.out.println("Head of the queue removed: " + q.remove());
		System.out.println(q);

		System.out.println("Size of the queue is "+ q.size());
	}
}