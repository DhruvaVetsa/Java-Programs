import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        if (age < 18) {
            System.out.println("You cant vote. Wait for " + (18 - age) + " years to vote.");
        }
        else {
            System.out.println("You can vote! Make sure you are carrying yor voters licence!");
        }
    }
}