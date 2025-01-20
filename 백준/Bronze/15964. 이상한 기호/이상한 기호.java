import java.util.Scanner;
interface Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int plus = a + b;
        int minus = a - b;
        
        System.out.println(plus * minus);
    }
}