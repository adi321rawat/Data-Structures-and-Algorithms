/*Given a String, print the character that is most commonly used in the String.
e.g
	"abcccccd" = 'c'
	"mango 111111112as" = '1'
*/
import java.util.Scanner;

public class Commom {

	public static char mostUsed(String s) {
		int ar[] = new int[256];

		int len = s.length();
		for(int i=0;i<len;i++) {
			ar[(int)(s.charAt(i))]++;
		}

		int max = -1;
		char a = ' ';

		for(int i=0;i<len;i++) {
			if(max < ar[(int)(s.charAt(i))]) {
				max = ar[(int)(s.charAt(i))];
				a = s.charAt(i);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(mostUsed(s));
		sc.close();
	}
}