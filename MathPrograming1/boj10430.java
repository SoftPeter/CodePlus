package MathPrograming1;

import java.util.Scanner;

public class boj10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans1 = (a+b)%c;
		int ans2 = ((a%c) + (b%c))%c;
		int ans3 = (a*b)%c;
		int ans4 = ((a%c) * (b%c))%c;
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		
		//첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력
	}
}
