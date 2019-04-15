package SortPrograming;

import java.util.*;

public class boj10814 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [][] mb = new String[N][2];
		
		for(int i=0; i<N; i++) {
			mb[i][0] = sc.next();
			mb[i][1] = sc.next();
		}
		
		Arrays.sort(mb, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for(int i=0; i<N; i++)
			System.out.println(mb[i][0] + " " + mb[i][1]);
	}
}
