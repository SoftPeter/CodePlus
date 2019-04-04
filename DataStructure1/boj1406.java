package DataStructure1;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class boj1406 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		int n = Integer.parseInt(br.readLine());
		Stack<String> leftstack = new Stack<>();
		Stack<String> rightstack = new Stack<>();

		// 왼쪽으로 몰아주기
		for (int i = 0; i < str.length; i++) {
			leftstack.push(str[i]);
		}
		
		//에디터 실행 
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			// L : 커서를 왼쪽 한칸 옮김
			if (arr[0].equals("L")) {
				if (!leftstack.isEmpty()) {
					rightstack.push(leftstack.lastElement());
					leftstack.pop();
				}
			}
			// D : 커서를 오른쪽 한칸 옮김
			else if (arr[0].equals("D")) {
				if (!rightstack.isEmpty()) {
					leftstack.push(rightstack.lastElement());
					rightstack.pop();
				}
			}
			// B : 커서 왼쪽 삭제
			else if (arr[0].equals("B")) {
				if (!leftstack.isEmpty()) {
					leftstack.pop();
				}
			}
			// P : 커서 왼쪽에 문자 삽입
			else if (arr[0].equals("P")) {
				leftstack.push(arr[1]);
			}
		}
		while(!leftstack.isEmpty()) {
			rightstack.push(leftstack.lastElement());
			leftstack.pop();
		}
		while(!rightstack.isEmpty()) {
			System.out.print(rightstack.pop());
		}
	}
}
