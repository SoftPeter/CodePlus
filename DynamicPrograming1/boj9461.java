package DynamicPrograming;

import java.util.*;

public class boj9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] d = {0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
		d = Arrays.copyOf(d, 101);
		
		for(int i=10; i<=100; i++) {
			d[i] = d[i-1] + d[i-5];
		}
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
