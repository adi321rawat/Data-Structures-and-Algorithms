/*Fibonacci Series
*/

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int turn) {
		if(turn < 2) {
			return turn;
		}

		return fib(turn-1) + fib(turn-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turns = sc.nextInt();
		System.out.println(fib(turns));
		sc.close();
	}
}