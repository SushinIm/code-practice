import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static boolean[][] matrix;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int computers = Integer.parseInt(br.readLine());
		int pairs = Integer.parseInt(br.readLine());

		matrix = new boolean[computers + 1][computers + 1];
		visited = new boolean[computers + 1];

		for (int i = 0; i < pairs; i++) {
			st = new StringTokenizer(br.readLine());

			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			matrix[from][to] = matrix[to][from] = true;
		}

		System.out.println(dfsFromOne(0, 1));
	}

	private static int dfsFromOne(int count, int start) {
		visited[start] = true;
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[start][i] && !visited[i]) {
				count = dfsFromOne(++count, i);
			}
		}

		return count;
	}
}