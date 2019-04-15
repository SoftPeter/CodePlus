package SortPrograming;

import java.util.*;
import java.io.*;

public class boj10825 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [][] st = new String[N][4];
		
		for(int i=0; i<N; i++) {
			st[i] = br.readLine().split(" ");
		}
		
		Arrays.sort(st, new Comparator<String[]>() {
			//0 = 이름 
			//1 = 국
			//2 = 영
			//3 = 수 
			@Override
			public int compare(String[] s1, String[] s2) {
				// TODO Auto-generated method stub
				if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
					if(Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
						if(Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
							//오름차순 
							return s1[0].compareTo(s2[0]);
						}
						//내림차순
						return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
					}
					//오름차순
					return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
				}
				//내림차순
				return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(st[i][0]);
		}
	}
}
