/*To check if a string is a Palindrome or not.
Palindroms	are Strings that form the same word if it is reversed.
e.g
	"radar" = true(palindrome)
	"abcd" = false
*/

import java.util.Scanner;

public class Palindrome {

	public static boolean palindrome(String s) {
		String rev = "";
		for(int i=0,j=s.length();i<j;i++) {
			rev = s.charAt(i) + rev;
		}
		if(s.compareTo(rev) == 0) {
			return true;
		} 
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(palindrome(s));
		sc.close();
	}
}