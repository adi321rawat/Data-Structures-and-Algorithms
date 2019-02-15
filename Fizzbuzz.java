/*The classic Fizzbuzz problem
Write a program that prints the numbers from 1 to n.
But for multiples of 3 it prints fizz
and for multiples of 5 it prints buzz
and for multilples of both 3 and 5 it prints fizzbuzz
*/
import java.util.Scanner;

public class Fizzbuzz {

	public static void fizzbuzz(int num) {
		for(int i=1;i<=num;i++) {
			if(i%15 == 0) {
				System.out.println("fizzbuzz");
			} else if(i%3 == 0) {
				System.out.println("fizz");
			} else if(i%5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fizzbuzz(num);
		sc.close();
	}
}