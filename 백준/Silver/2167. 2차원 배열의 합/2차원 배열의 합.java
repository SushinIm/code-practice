import java.io.*;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken()) + 1;

		int[][] original = new int[n][m];
		int[][] arr = new int[n][m];
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < m; j++) {
				original[i][j] = Integer.parseInt(st.nextToken());
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1] + original[i][j] - arr[i - 1][j - 1];
			}
		}

		int k = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			sb.append(arr[x2][y2] + arr[x1 - 1][y1 - 1] - arr[x2][y1 -1] - arr[x1 - 1][y2]);
            sb.append("\n");
		}

		System.out.println(sb);
    }
}