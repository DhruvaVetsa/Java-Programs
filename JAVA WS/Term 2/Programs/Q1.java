import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.print("The number is ");
        if (num % 2 == 0) {
            System.out.println("even.");
        }
        else {
            System.out.println("odd.");
        }
    }
}