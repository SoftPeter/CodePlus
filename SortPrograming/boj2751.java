package SortPrograming;

import java.io.*;

public class boj2751 {
	public static void main(String[] args) throws IOException{
		final int MAX = 2000000;
		final int MIN = 1000000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] check = new boolean[MAX+1];
		int N = Integer.parseInt(br.readLine().trim());
		for(int i=0; i<N; i++)
			check[Integer.parseInt(br.readLine()) + MIN] = true;
		
		for(int i=0; i<MAX+1; i++) {
			if(check[i])	sb.append(i-MIN).append("\n");
		}
		System.out.println(sb);
	}
}
