package DynamicPrograming;
import java.util.*;

public class boj11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //구매하려는 카드 개수
		int p[] = new int[10001];
		int d[] = new int[1001];
		//가격 설정
		for(int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
		}
		
		//최대값 구하기 
		d[0] = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				d[i] = Math.max(d[i], d[i-j]+p[j]);
			}
		}
		System.out.println(d[n]);
	}
}
