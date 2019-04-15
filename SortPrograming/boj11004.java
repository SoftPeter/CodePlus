package SortPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11004 {
	static int N, K;
	static int[] ar;
	static int ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		ar = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		ans = quickSort(1, N, K);
		System.out.println(ans);
	}
	
	private static int quickSort(int left, int right, int ks) {
		if(left == right) {
			return ar[left];
		}
		int l = left - 1;
		int r = right + 1;
		int pivot = ar[(l+r)/2];
		int tmp;
		
		while(true) {
			while(ar[++l]<pivot);
			while(ar[--r]>pivot);
			
			if(l>=r) {
				break;
			}
			
			tmp = ar[l];
			ar[l] = ar[r];
			ar[r] = tmp;
		}
		
		if(l == r && l == ks) {
			return pivot;
		}
		else if(ks < l) {
			return quickSort(left, l-1, ks);
		}
		else {
			return quickSort(r+1, right, ks);
		}
	}
}