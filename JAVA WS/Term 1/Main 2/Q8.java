import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter 3 random numbers : - ");
        a = scannerObj.nextInt();
        b = scannerObj.nextInt();
        c = scannerObj.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("----------------------------");
        System.out.println("result = " + (a - ++c - ++b));
        System.out.println("----------------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
