package DataStructure1;
import java.util.*;
public class boj2743 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				n++;
			}
		}
		System.out.println(n);
	}
}
