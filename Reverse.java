/*Reversing a given Integer
*/

import java.util.Scanner;

public class Reverse {

	public static int rev(int num) {
		int r = 0;
		while(num != 0) {
			int temp = num%10;
			r = (r*10) + temp;
			num /= 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(rev(num));
		sc.close();
	}
}