import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print("The smallest number is ");
        if (a < b && a < c) {
            System.out.println(a);
        }
        else if (b < c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}