import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.print("You are");
        if (age < 18) {
            System.out.print("not");
        }
        System.out.print(" eligible to vote.");
        
    }
}