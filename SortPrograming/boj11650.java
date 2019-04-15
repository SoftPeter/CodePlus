package SortPrograming;

import java.util.*;

public class boj11650 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [][] xy = new int[N][2];
		
		for(int i=0; i<N; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		Arrays.sort(xy, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0])	return Integer.compare(o1[1], o2[1]);
				else	return  Integer.compare(o1[0], o2[0]);
			}
			
		});
		
		for(int i=0; i<N; i++)
			System.out.println(xy[i][0] + " " + xy[i][1]);
	}
}
