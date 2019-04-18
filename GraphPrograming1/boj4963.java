package GraphPrograming1;

import java.util.*;

public class boj4963 {
	public static final int[] dx = {0,0,1,-1,1,1,-1,-1};
	public static final int[] dy = {1,-1,0,0,1,-1,1,-1};
	
	public static void dfs(int a[][], int d[][], int x, int y, int cnt, int n, int m) {
		d[x][y] = cnt;
		for(int k=0; k<dx.length; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(0 <= nx && nx < m && 0 <= ny && ny < n) {
				if(a[nx][ny] == 1 && d[nx][ny] == 0) {
					dfs(a, d, nx, ny, cnt, n, m);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) {
				break;
			}
			
			int a[][] = new int [m][n];
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					a[i][j] = sc.nextInt(); 
				}
			}
			
			int cnt = 0;
			int d[][] = new int [m][n];
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(a[i][j] == 1 && d[i][j] == 0) {
						dfs(a, d, i, j, ++cnt, n, m);
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
