package DataStructure1;
import java.util.*;
public class boj1158 {
	public static void main(String[] args) {
		/*
		 	push_front X: 정수 X를 덱의 앞에 넣는다.
			push_back X: 정수 X를 덱의 뒤에 넣는다.
			pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			size: 덱에 들어있는 정수의 개수를 출력한다.
			empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
			front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> deque = new LinkedList<>();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			if(str.equals("push_front")) {
				int b = sc.nextInt();
				deque.addFirst(b);
			}
			else if(str.equals("push_back")) {
				int b = sc.nextInt();
				deque.addLast(b);
			}
			else if(str.equals("pop_front")) {
				System.out.println(deque.isEmpty()?-1:deque.pop());
			}
			else if(str.equals("pop_back")) {
				System.out.println(deque.isEmpty()?-1:deque.removeLast());
			}
			else if(str.equals("size")) {
				System.out.println(deque.size());
			}
			else if(str.equals("empty")) {
				System.out.println(deque.isEmpty()?1:0);
			}
			else if(str.equals("front")) {
				System.out.println(deque.isEmpty()?-1:deque.peek());
			}
			else if(str.equals("back")) {
				System.out.println(deque.isEmpty()?-1:deque.peekLast());
			}
		}
	}
}
