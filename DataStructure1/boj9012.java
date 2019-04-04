package DataStructure1;
import java.util.*;
public class boj9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String input;

		for (int i = 0; i < t; i++) {
			input = sc.next();
			String res = "YES";
			Stack<Integer> st = new Stack<Integer>();
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j)=='(') {
					st.push(1);
				} else if (input.charAt(j)==')') {
					if (st.isEmpty()) {
						res = "NO";
						break;
					} else {
						st.pop();
					}
				}
			}
			if (!st.isEmpty()) {
				res = "NO";
			}
			System.out.println(res);

		}
	}
}
