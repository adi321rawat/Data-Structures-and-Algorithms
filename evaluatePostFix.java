/*Evaluation of postfix expression
*/

import java.util.*;

public class evaluatePostFix {

	public static int eval(String[] tokens) {
		String operator = "+-*/";
		Stack<String> st = new Stack<String>();
		int res = 0;

		for(String t: tokens) {

			if(!operator.contains(t)) {
				st.push(t);
			} else {
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				if(t == "+") {
					res = a + b;
				} else if(t == "-") {
					res = a - b;
				} else if(t == "*") {
					res = a * b;
				} else {
					res = a / b;
				}
				st.push(String.valueOf(res));
				res = 0;
			} 
		}
		res = Integer.valueOf(st.pop());

		return res;
	}

	public static void main(String[] args) {
		String[] tokens = new String[]{"1", "1", "1", "+", "+", "1", "+"};
		System.out.println(eval(tokens));
	}
}