/*Program implemeting a Stack
*/
import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<4;i++) {
			st.push(i);
		}
		System.out.println(st);
		if(!st.isEmpty()){
			System.out.println("Stack is not empty");
		}

		System.out.println("Top of the stack is " + st.peek());
		
		System.out.println("Pop function: " + st.pop());
		System.out.println("Pop function: " + st.pop());
		
		System.out.println(st);
	}
}