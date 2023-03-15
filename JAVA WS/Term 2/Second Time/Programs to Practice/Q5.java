import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.print(a);
        }
        else if (b > c) {
            System.out.print(b);
        }
        else {
            System.out.print(c);
        }
        System.out.print(" is the greatest number among " + a + " " + b + " " + c);
    }
}