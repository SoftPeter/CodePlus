package SortPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class boj11652 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] num = new long[N];
		
		for(int i=0; i<N; i++) {
			num[i] = Long.parseLong(br.readLine()); 
		}
		
		Arrays.sort(num);
		
		long ans = num[0];
		int cnt = 1;
		int ans_cnt = 1;
		
		for(int i=1; i<N; i++) {
			if(num[i] == num[i-1]) {
				cnt += 1;
			}else {
				cnt = 1;
			}
			if(ans_cnt < cnt) {
				ans_cnt = cnt;
				ans = num[i];
			}
		}
		System.out.println(ans);
		
	}
}
