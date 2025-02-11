import java.util.*;

interface Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sticks = new int[sc.nextInt()];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextInt();
		}

		int front = 0;
		int result = 0;
		for (int i = sticks.length - 1; i >= 0; i--) {
			if (front < sticks[i]) {
				front = sticks[i];
				result++;
			}
		}

		System.out.println(result);
    }
}