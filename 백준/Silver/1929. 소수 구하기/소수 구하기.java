import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[n + 1];
		m = Math.max(m, 2);

		for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
			for (int j = 2; i * j <= n; j++) {
				arr[i * j] = true;
			}
		}

		for (int i = m; i <= n; i++) {
			if (arr[i]) continue;
			System.out.println(i);
		}
    }
}