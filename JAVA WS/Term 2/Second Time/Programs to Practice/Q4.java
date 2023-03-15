import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive");
        }
        else if (num < 0) {
            System.out.println(num + " is negative");
        }
        else {
            System.out.println(num + " is zero");
        }
    }
}