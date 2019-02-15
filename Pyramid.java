/* Printing a pyramid
e.g 
num = 4
	   #
	  ###
	 #####
	#######
*/

import java.util.Scanner;
import java.lang.Math;

public class Pyramid {

	public static void pyramid(int num) {

		int midPoint =(int)Math.floor((2 * num - 1) / 2);

		for(int row = 0; row < num; row++) {
			for(int column = 0; column < 2 * num - 1; column++) {
				if(midPoint - row <= column && midPoint + row >= column) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pyramid(num);
		sc.close();
	}
}
