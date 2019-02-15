
import java.util.Scanner;
/*To check if two given Strings are anagrams of each other
One String is anagram of another if it uses the same characters in the same quantity.
Considering only charaters(no spaces and punctuation)
Capital letters are considered to be same as lower case.
e.g
	"rail safeTy", "Fairy tail" = true(anagrams)
	"Yo", "hey" = false
*/
public class Anagrams {

	public static int[] count(String s) {
		s = s.toLowerCase();
		int ar[] = new int[26];
		for(int i=0,l=s.length();i<l;i++) {
			if(s.charAt(i) > 97 && s.charAt(i) < 123) {
				ar[(int)(s.charAt(i)-97)] += 1;
			} 
		}
		return ar;
	}

	public static boolean anagram(String s1, String s2) {
		int ar[] = count(s1);
		int arr[] = count(s2);

		for(int i=0;i<26;i++) {
			if(ar[i] != arr[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(anagram(s1, s2));
		sc.close();
	}

}