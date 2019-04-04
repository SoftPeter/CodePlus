package DataStructure1;
import java.util.*;
public class boj10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		String input;
		int b = 0;
		for(int i=0; i<n; i++) {
			input = sc.next();
			if(input.equals("push")) {
				b = sc.nextInt();
				que.add(b);
			}
			else if(input.equals("front")) {
				System.out.println(que.isEmpty()?-1:que.peek());
			}
			else if(input.equals("back")) {
				System.out.println(que.isEmpty()?-1:b);
			}
			else if(input.equals("size")) {
				System.out.println(que.size());
			}
			else if(input.equals("pop")) {
				System.out.println(que.isEmpty()?-1:que.poll());
			}
			else if(input.equals("empty")) {
				System.out.println(que.isEmpty()?1:0);
			}
		}
	}
}
