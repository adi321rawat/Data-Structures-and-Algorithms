/*
*/

import java.util.Scanner;

public class Steps {

	/*
	Printing 
		#
		##
		###
	*/
	public static void upperRight(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j <= i){
					System.out.print("#");	
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	Printing 
		  #
		 ##
		###
	*/
	public static void upperLeft(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>=0;j--) {
				if(i >= j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	Printing 
		###
		##
		#
	*/
	public static void lowerRight(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>=0;j--) {
				if(i <= j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	Printing 
		###
		 ##
		  #
	*/
	public static void lowerLeft(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i <= j) {
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

		upperRight(num);
		System.out.println();
		upperLeft(num);
		System.out.println();
		lowerRight(num);
		System.out.println();
		lowerLeft(num);

		sc.close();
	}
}