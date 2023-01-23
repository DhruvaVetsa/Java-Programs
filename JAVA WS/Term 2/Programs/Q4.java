import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.print("The number is ");
        if (num > 0) {
            System.out.println("positive");
        }
        else if (num < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}