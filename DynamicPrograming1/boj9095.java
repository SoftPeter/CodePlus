package DynamicPrograming;
import java.util.*;
public class boj9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] d = new int[11];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			for(int j=4; j<=n; j++) {
				d[j] = d[j-1]+ d[j-2] + d[j-3];
			}
			System.out.println(d[n]);
		}
	}
}
