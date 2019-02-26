/*Program to implement Binary Search
*/

import java.util.*;
import java.io.*;

public class BinarySearch {
	
	public static int bs(int[] arr, int val) {
		if(arr == null || arr.length == 0) {
			return -1;
		}

		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == val) {
				return mid;
			} else {
				if(arr[mid] > val) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		int value = 6;
		int res = bs(arr, value);
		System.out.println(res);
	}
}