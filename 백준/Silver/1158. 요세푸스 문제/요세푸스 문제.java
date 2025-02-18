import java.io.*;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		int index = 1;
		while (!q.isEmpty()) {
			if (index++ != k) {
				q.add(q.poll());
			} else {
				index = 1;
				sb.append(q.poll());
				sb.append(q.isEmpty() ? ">" : ", ");
			}
		}

		System.out.println(sb);
    }
}