/*Finding number of vowels in a given string
e.g
	"What a fine day" = 5
	"Good Morning" = 4
*/

import java.util.Scanner;

public class Vowels {

	public static int vowel(String s) {
		int count = 0;
		s = s.toLowerCase();
		for(int i=0,l=s.length(); i<l; i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(vowel(s));
		sc.close();
	}
}