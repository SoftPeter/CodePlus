package DataStructure1;
import java.util.*;
public class boj10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int nA = 0, na = 0, nn = 0, ns = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				nA++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				na++;
			}
			else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				nn++;
			}
			else if(str.charAt(i) == ' '){
				ns++;
			}
		}
		System.out.println(na + " " + nA + " " + nn + " " + ns);
		}
	}
}
