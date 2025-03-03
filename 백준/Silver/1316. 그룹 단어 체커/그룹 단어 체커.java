import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int count = testCase;

		for (int i = 0; i < testCase; i++) {
			char past = 0;
			Map<Character, Boolean> map = new HashMap<>();
			String str = br.readLine();
			for (char c : str.toCharArray()) {
				if (past == c) {
					continue;
				}
				if (map.containsKey(c)) {
					count--;
					break;
				}
				past = c;
				map.put(c, true);
			}
		}
		System.out.println(count);
    }
}