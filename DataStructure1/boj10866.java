package DataStructure1;
import java.util.*;
public class boj10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		int m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			que1.offer(i);
		}
		int count=1;
		while(!que1.isEmpty()) {
			if(count%m == 0) {
				que2.offer(que1.poll());
			}
			else if(count%m != 0) {
				que1.offer(que1.poll());
			}
			count++;
		}
		System.out.print("<" + que2.poll());
		while(!que2.isEmpty()) {
			System.out.print(", " + que2.poll());
		}
		System.out.print(">");
	}
}
