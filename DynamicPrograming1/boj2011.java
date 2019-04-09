package DynamicPrograming;
import java.util.*;

public class boj2011 {
	public static void main(String[] args) {
		final int dns = 1000000;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		int n = s.length();
		s = " " + s;
		int[] d = new int[n+1];
		d[0]=1;
		for(int i=1; i<=n; i++) {
			int x = s.charAt(i) - '0';
			if(1 <= x && x<=9) {
				d[i] += d[i-1];
				d[i] %= dns;
			}
			if(i == 1) continue;
			if(s.charAt(i-1) == '0') continue;
			x = (s.charAt(i-1)-'0')*10 + (s.charAt(i)- '0');
			if(10 <= x && x <= 26) {
				d[i] += d[i-2];
				d[i] %= dns;
			}
		}
		System.out.println(d[n]);
	}
}