import java.util.*;
import java.io.*;

class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;

		graph = new ArrayList[n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
			graph[v].add(u);
		}

		for (int i = 1; i < graph.length; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}

		System.out.println(count);
    }
    
    private static void dfs(int node) {
		visited[node] = true;
		for (int x : graph[node]) {
			if (!visited[x]) {
				dfs(x);
			}
		}
	}
}