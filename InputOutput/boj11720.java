package InputOutput;
import java.util.*;
public class boj11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		String str = sc.nextLine();
		for(int i=0; i<n; i++) {
			sum = sum + str.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}