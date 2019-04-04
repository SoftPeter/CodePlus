package DataStructure1;
import java.util.*;
public class boj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] n = new int[26];
		
		for(int i=0; i<26; i++) {
			n[i] = -1;
		}
		
		for(int i=0; i<str.length(); i++) {
			int a = str.charAt(i) - 'a';
			if(n[a] == -1) {
				n[a] = i;
			}
			
		}
		for(int i=0; i<26; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
