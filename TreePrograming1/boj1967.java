package TreePrograming1;

import java.util.*;

class Node{
	public int to;
	public int cost;
	Node(int to, int cost){
		this.to = to;
		this.cost = cost;
	}
}

public class boj1967 {
	public static int[] bfs(int n, List<Node>[] a, int start) {
		boolean check[] = new boolean[10001];
		int dist[] = new int[10001];
		Queue<Integer> q = new LinkedList<Integer>();
		check[start] = true;
		q.add(start);
		while(!q.isEmpty()) {
			int x = q.remove();
			for(Node node : a[x]) {
				int y = node.to;
				int cost = node.cost;
				if(check[y] == false) {
					check[y] = true;
					dist[y] = dist[x] + cost;
					q.add(y);
				}
			}
		}
		return dist;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		List<Node> a[] = (List<Node>[]) new List[n+1];
		for(int i=0; i<=n; i++) {
			a[i] = new ArrayList<Node>();
		}
		
		for(int i=0; i<n-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			a[u].add(new Node(v,w));
			a[v].add(new Node(u,w));
		}
		int dist[] = bfs(n, a, 1);
		
		int start = 1;
		for(int i = 2; i<=n; i++) {
			if(dist[i] > dist[start]) {
				start = i;
			}
		}
		
		dist = bfs(n, a, start);
		int ans = dist[1];
		for(int i=2; i<=n; i++) {
			if(ans < dist[i]) {
				ans = dist[i];
			}
		}
		System.out.println(ans);
	}
}