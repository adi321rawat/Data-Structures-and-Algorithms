/*Write a function that accepts an integer N
and returns an N X N matrix
e.g
	n = 2
	[[1, 2], [4, 3]]

	n = 4 
	[[1, 2, 3, 4]
	[12, 13, 14, 5]
	[11, 16, 15, 6]
	[10, 9, 8, 7]]
*/

import java.util.Scanner;

public class Spiral {

	public static int[][] matrixSpiral(int num) {
		int[][] ar = new int[num][num];
		int counter = 1;
		int startCol = 0;
		int startRow = 0;
		int endCol = num-1;
		int endRow = num-1;
		while(startCol <= endCol && startRow <= endRow) {
			for(int i=startCol; i<=endCol; i++) {
				ar[startRow][i] = counter;
				counter++;
			}
			startRow++;

			for(int j=startRow; j<=endRow; j++) {
				ar[j][endCol] = counter;
				counter++;
			}
			endCol--;

			for(int k=endCol; k>=startCol; k--) {
				ar[endRow][k] = counter;
				counter++;
			}
			endRow--;

			for(int l=endRow; l>=startRow; l--) {
				ar[l][startCol] = counter;
				counter++;
			}
			startCol++;
		}
		return ar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = matrixSpiral(n);

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}

