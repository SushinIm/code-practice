import java.util.Scanner;
interface Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long plus = a + b;
        long minus = a - b;
        
        System.out.println(plus * minus);
    }
}