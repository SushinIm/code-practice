import java.io.*;

interface Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int result = 0;
		while (n > 0) {
			if (n % 5 == 0) {
				result++;
			}
			if (n % 25 == 0) {
				result++;
			}
			if (n % 125 == 0) {
				result++;
			}
			n--;
		}

		System.out.println(result);
    }
}