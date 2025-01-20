import java.util.Scanner;

interface Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        switch(sc.next()) {
                case "A+": System.out.println(4.3f); break;
                case "A0": System.out.println(4.0f); break;
                case "A-": System.out.println(3.7f); break;
                case "B+": System.out.println(3.3f); break;
                case "B0": System.out.println(3.0f); break;
                case "B-": System.out.println(2.7f); break;
                case "C+": System.out.println(2.3f); break;
                case "C0": System.out.println(2.0f); break;
                case "C-": System.out.println(1.7f); break;
                case "D+": System.out.println(1.3f); break;
                case "D0": System.out.println(1.0f); break;
                case "D-": System.out.println(0.7f); break;
                default : System.out.println(0.0f);
        }
        sc.close();
    }
}