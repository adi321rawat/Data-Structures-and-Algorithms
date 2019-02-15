/*To find the reverse of a String
e.g 
	"Dog" = "goD"
	"I am hungry" = "yrgnuh ma I" 
*/
import java.util.Scanner;

public class Stringreversal {
	public static String stringrev(String s) {
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(stringrev(s));
		sc.close();
	}
}