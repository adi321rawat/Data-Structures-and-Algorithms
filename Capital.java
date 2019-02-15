/*To capitalise the first letter of each world in a string.
e.g
	"hey there, nice to see you" = "Hey There, Nice To See You"
	"i am fine" = "I Am Fine"
*/
import java.util.Scanner;

public class Capital {

	public static String capitalize(String s) {
		String str[] = s.split(" ");
		for(int i=0,l=str.length;i<l;i++) {
			str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1);
		}
		return String.join(" ", str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(capitalize(s));
		sc.close();
	}
}