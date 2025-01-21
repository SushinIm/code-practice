import java.util.Scanner;

interface Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int nextInt = 0;
        while(sc.hasNext()) {
            nextInt = sc.nextInt();
            result += nextInt;
            
            if (result >= 100) {
                break;
            }
        }

		int big = result - 100;
		int small = Math.abs(result - nextInt - 100);

		System.out.println(Math.min(big, small) == big ? result : result - nextInt);
    }
}