package DataStructure1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;
public class boj11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int n = str1.length();
		String[] str2 = new String[n];
		
		for(int i=0; i<n; i++) {
			str2[i] = str1.substring(i, n);
		}
		
		Arrays.sort(str2);
		
		for(int i=0; i<n; i++) {
			System.out.println(str2[i]);
		}
		
	}
}
