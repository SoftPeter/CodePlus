package MathPrograming1;

import java.util.Scanner;

public class boj2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		String s = line[0];
		int n = Integer.parseInt(line[1]);
		int ans = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if('0' <= c && c <= '9') {
				ans = ans * n + (c-'0');
			} else {
				ans = ans * n + (c-'A'+10);
			}
		}
		System.out.println(ans);
	}
}
