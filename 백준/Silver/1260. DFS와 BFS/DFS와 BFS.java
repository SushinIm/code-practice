import java.io.*;
import java.util.*;

class Main {
	static boolean[][] matrix;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder dfs = new StringBuilder();
		StringBuilder bfs = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		matrix = new boolean[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			matrix[from][to] = true;
			matrix[to][from] = true;
		}

		dfs(v, dfs);
		visited = new boolean[n + 1];
		bfs(v, bfs);

		System.out.println(dfs);
		System.out.println(bfs);
	}

	private static void dfs(int v, StringBuilder dfs) {
		visited[v] = true;
		dfs.append(v);
		dfs.append(" ");
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[v][i] && !visited[i]) {
				dfs(i, dfs);
			}
		}
	}

	private static void bfs(int v, StringBuilder bfs) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;
		while (!queue.isEmpty()) {
			v = queue.poll();
			bfs.append(v);
			bfs.append(" ");
			for (int i = 1; i < matrix.length; i++) {
				if (matrix[v][i] && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}