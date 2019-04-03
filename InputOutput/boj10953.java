package InputOutput;
import java.util.*;
public class boj10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			String[] Arrs = sc.next().split(",");
			System.out.println(Integer.parseInt(Arrs[0]) + Integer.parseInt(Arrs[1]));
		}
	}
}