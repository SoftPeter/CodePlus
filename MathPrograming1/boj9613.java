package MathPrograming1;

import java.util.Scanner;

public class boj9613 {
	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		} else {
			return gcd(y, x%y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j=0; j<n; j++) {
				a[j] = sc.nextInt();
			}
			long ans = 0;
			for(int j=0; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					ans += gcd(a[j], a[k]);
				}
			}
			System.out.println(ans);
		}
	}
}