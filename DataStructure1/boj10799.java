package DataStructure1;
import java.util.*;
public class boj10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		String input = sc.next();
		int sum=0;
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i) =='(') {
				st.push(i);
			} else {
				//레이저 일 경우 
				if(i - st.peek() == 1) {
					st.pop();
					sum = sum + st.size();
				} else { //레이저가 아닐 경우 
					st.pop();
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
	}
}
