package GraphPrograming1;

import java.util.*;

public class boj9466 {
	static int a[];
	static int c[];
	static int s[];
	public static int dfs(int start, int cnt, int step) {
		if(c[start] != 0) {
			if(step != s[start]) {
				return 0;
			}
			return cnt - c[start];
		}
		c[start] = cnt;
		s[start] = step;
		
		return dfs(a[start], cnt+1, step);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			a = new int[n+1];
			c = new int[n+1];
			s = new int[n+1];
			for(int i=1; i<=n; i++) {
				a[i] = sc.nextInt();
			}
			int ans = 0;
			for(int i=1; i<=n; i++) {
				if(c[i] == 0) {
					ans += dfs(i, 1, i);
				}
			}
			System.out.println(n-ans);
		}
	}
}
