package MathPrograming1;

import java.util.Scanner;

public class boj1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//true = 지워진것, false = 지워지지 않은 것 
		boolean[] check = new boolean[m+1];
		check[0] = check[1] = true;
		for(int i = 2; i*i<=m; i++) {
			if(check[i] == true) {
				continue;
			}
			for(int j = i+i; j<=m; j+=i) {
				check[j] = true;
			}
		}
		
		for(int i = n; i<=m; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
		
	}
}