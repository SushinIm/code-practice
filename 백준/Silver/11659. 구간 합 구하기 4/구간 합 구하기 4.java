import java.io.*;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[Integer.parseInt(st.nextToken()) + 1];
		int loop = Integer.parseInt(st.nextToken());

		int index = 1;
		int element = 0;
		for (String s : br.readLine().split(" ")) {
			element += Integer.parseInt(s);
			arr[index++] = element;
		}

		for (index = 0; index < loop; index++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken());
			System.out.println(arr[j] - arr[i]);
		}
    }   
}