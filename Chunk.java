/*Given an array and chunk size, divide the array into many subarrays
where each subarray is of length size
e.g
	([1, 2, 3, 4, 5, 6, 7], 3) = ([1, 2, 3], [4, 5, 6], [7])
	([1, 2, 3, 4, 5], 10) = ([1, 2, 3, 4, 5])
*/
import java.util.Scanner;
import java.util.Arrays;

public class Chunk {
	public static int[][] chunk(int size, int[] arr) {
		int rest = arr.length % size;
		int chunks = arr.length / size + (rest > 0 ? 1 : 0);
		int newArr[][] = new int[chunks][];

		for(int i=0; i < (rest > 0 ? chunks-1 : chunks);i++) {
			newArr[i] = Arrays.copyOfRange(arr, i*size, i*size + size);
		}
		if(rest > 0) {
			newArr[chunks-1] = Arrays.copyOfRange(arr, (chunks-1) * size, arr.length);
		}

		return newArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int size = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		int ar[][] = chunk(size, arr);
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println(" ");
		}
		sc.close();
	}
}