import java.io.*;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		for (char c : br.readLine().toCharArray()) {
			int num = c - '0';
			if (num == 6 || num == 9) {
				map.put(6, map.getOrDefault(6, 0) + 1);
			} else {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
 		int result = 0;
		for (int key = 0; key < 9; key++) {
			int num = map.getOrDefault(key, 0);
			if (key == 6) {
				num = num % 2 + num / 2;
			}
			result = Math.max(result, num);
		}

		System.out.println(result);
    }
}